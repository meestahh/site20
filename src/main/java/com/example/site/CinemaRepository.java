package com.example.site;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CinemaRepository extends JpaRepository<Cinema,Long>{
    @Query("SELECT p FROM Cinema p WHERE concat(p.film_name, '', p.cinema_studio, '', p.date_film, '', p.time_film, '', p.amount) LIKE %?1%")
    List<Cinema> search(String keyword);
}
