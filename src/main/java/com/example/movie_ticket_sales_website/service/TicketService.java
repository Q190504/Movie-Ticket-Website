package com.example.movie_ticket_sales_website.service;

import com.example.movie_ticket_sales_website.model.Seat;
import com.example.movie_ticket_sales_website.repository.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;

@Service
//Handles booking logic, with synchronization capabilities to avoid conflicts when multiple users book at the same time.
public class TicketService {
    private final ReentrantLock lock = new ReentrantLock();

    public String reserveSeat(Seat seat, SeatRepository seatRepository) {
        lock.lock();
        try
        {
            if (seat.isAvailable())
            {
                seat.reserve(); // Set status as reserved
                String code = generateShortCancelCode();
                seat.setCancelCode(code);

                // Save the updated seat status to the database
                seatRepository.save(seat);

                return code;
            }
            return "fail";
        }
        finally
        {
            lock.unlock();
        }
    }

    public boolean cancelSeatByCode(String cancelCode, Seat seat, SeatRepository seatRepository)
    {
        if (cancelCode.equals(seat.getCancelCode()))
        {
            seat.cancel();
            seat.setCancelCode(null); // Clear after cancellation

            // Save the updated seat status to the database
            seatRepository.save(seat);

            return true; // Cancel success
        }
        return false; // Invalid code
    }

    public String generateShortCancelCode() {
        return UUID.randomUUID().toString().substring(0, 8).toUpperCase(); // e.g. "AB12CD34"
    }

}
