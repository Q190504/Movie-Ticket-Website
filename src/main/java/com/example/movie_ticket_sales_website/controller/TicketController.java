package com.example.movie_ticket_sales_website.controller;

import com.example.movie_ticket_sales_website.model.Movie;
import com.example.movie_ticket_sales_website.model.Seat;
import com.example.movie_ticket_sales_website.model.SeatMap;
import com.example.movie_ticket_sales_website.repository.MovieRepository;
import com.example.movie_ticket_sales_website.repository.SeatMapRepository;
import com.example.movie_ticket_sales_website.service.TicketService;
import com.example.movie_ticket_sales_website.repository.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

//Manage user requests, such as booking tickets.
@Controller
public class TicketController {
    @Autowired
    private SeatRepository seatRepo;

    @Autowired
    private SeatMapRepository seatMapRepo;

    @Autowired
    private MovieRepository movieRepo;

    private final TicketService ticketService = new TicketService();

    private Movie movie;
    private SeatMap seatMap;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("seats", seatRepo.findAll());
        movie = movieRepo.findById("1").orElse(null);
        assert movie != null;
        model.addAttribute("movie", movie);
        seatMap = seatMapRepo.findByMovieId(movie.getId());
        model.addAttribute("columns", seatMap.getRowNums());
        model.addAttribute("rows", seatMap.getRowNums());
        return "index";
    }

    @PostMapping("/reserve")
    public String reserveSeat(@RequestParam String seatName, Model model, RedirectAttributes redirectAttributes) {
        char row = seatName.charAt(0);
        int col = Integer.parseInt(seatName.substring(1));
        Seat seat = seatRepo.findByRowAndColumn(row, col);

        String cancelCode = ticketService.reserveSeat(seat, seatRepo);
        if (!cancelCode.equals("fail"))
        {
            redirectAttributes.addFlashAttribute("message", "Đặt vé thành công cho ghế số: " + seatName +
                    ".\n Mã huỷ vé của bạn là: " + cancelCode + ".");
        }
        else
        {
            redirectAttributes.addFlashAttribute("message", "Ghế số " + seatName + " không thể chọn.");
        }

        redirectAttributes.addFlashAttribute("seats", seatRepo.findAll());
        movie = movieRepo.findById("1").orElse(null);
        assert movie != null;
        model.addAttribute("movie", movie);
        seatMap = seatMapRepo.findByMovieId(movie.getId());
        model.addAttribute("columns", seatMap.getRowNums());
        model.addAttribute("rows", seatMap.getRowNums());

        return "redirect:/";
    }

    @PostMapping("/cancel")
    public String cancelSeat(@RequestParam String seatName, @RequestParam String cancelCode, Model model, RedirectAttributes redirectAttributes) {
        // Find seat by Name
        char row = seatName.charAt(0);
        int col = Integer.parseInt(seatName.substring(1));
        Seat seat = seatRepo.findByRowAndColumn(row, col);

        if (seat == null)
            redirectAttributes.addFlashAttribute("message", "Không tìm thấy ghế.");
        else
        {
            boolean result = ticketService.cancelSeatByCode(cancelCode, seat, seatRepo);
            if (result) {
                redirectAttributes.addFlashAttribute("message", "Huỷ vé thành công.");
            } else {
                redirectAttributes.addFlashAttribute("message", "Mã huỷ không hợp lệ.");
            }
        }

        redirectAttributes.addFlashAttribute("seats", seatRepo.findAll());
        movie = movieRepo.findById("1").orElse(null);
        assert movie != null;
        model.addAttribute("movie", movie);
        seatMap = seatMapRepo.findByMovieId(movie.getId());
        model.addAttribute("columns", seatMap.getRowNums());
        model.addAttribute("rows", seatMap.getRowNums());

        return "redirect:/";
    }
}
