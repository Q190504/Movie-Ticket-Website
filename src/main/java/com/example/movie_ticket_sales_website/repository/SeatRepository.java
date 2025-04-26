package com.example.movie_ticket_sales_website.repository;

import com.example.movie_ticket_sales_website.model.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

//Manage seats in a theater.
@Repository
@EnableJpaRepositories
public interface SeatRepository extends JpaRepository<Seat, String>
{
    Seat findByRowAndColumn(char row_label, int col_number);
}
