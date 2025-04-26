package com.example.movie_ticket_sales_website.model;

import jakarta.persistence.*;

//Ticket description (movie and seat information).
@Entity
@Table(name = "Ticket")
public class Ticket {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ticket_id")
    private int id;

    @Column(name = "movie_id")
    private int movieId;

    @Column(name = "seat_id")
    private int seatId;


    public Ticket(Movie movie, Seat seat) {
        this.movieId = movie.getId();
        this.seatId = seat.getId();
    }

    public Ticket() {
        this.movieId = -1;
        this.seatId = -1;
    }

    public int getMovieId() {
        return movieId;
    }

    public int getSeatId() {
        return seatId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}