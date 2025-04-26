package com.example.movie_ticket_sales_website.model;

import jakarta.persistence.*;

//Movie's attributes (name, genre, ticket price).
@Entity
@Table(name = "Movie")
public class Movie {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_id")
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "genre")
    private String genre;

    @Column(name = "ticket_price")
    private double ticketPrice;


    // Constructor, getters and setters
    public Movie(String title, String genre, double ticketPrice) {
        this.title = title;
        this.genre = genre;
        this.ticketPrice = ticketPrice;
    }

    public Movie() {
        this.title = "default title";
        this.genre = "default genre";
        this.ticketPrice = 0;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
