package com.example.movie_ticket_sales_website.repository;

import com.example.movie_ticket_sales_website.model.SeatMap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

//Manage seats in a theater.
@Repository
@EnableJpaRepositories
public interface SeatMapRepository extends JpaRepository<SeatMap, Integer>
{
    SeatMap findByMovieId(int movie_id);
}


