package com.example.movie_ticket_sales_website.model;

import jakarta.persistence.*;

@Entity
@Table(name = "SeatRepository")
public class SeatMap {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "movie_id")
    private int movieId;

    @Column(name = "row_nums")
    private int rowNums; // Total rows in the theater

    @Column(name = "column_nums")
    private int columnNums; // Total columns in the theater

    // Getters and Setters
    public int getRowNums() {
        return rowNums;
    }

    public void setRowNums(int rowNums) {
        this.rowNums = rowNums;
    }

    public int getColumnNums() {
        return columnNums;
    }

    public void setColumnNums(int columnNums) {
        this.columnNums = columnNums;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
}

