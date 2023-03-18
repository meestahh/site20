package com.example.site;//1-й класс

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Cinema {
    public long id;//id

    public String film_name;//вид техники
    public String cinema_studio;//тип техники
    public String date_film;//Дата ввоза на склад
    public String time_film;//Дата вывоза со склада
    public String amount;//Имя

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFilm_name() {
        return film_name;
    }

    public void setFilm_name(String film_name) {
        this.film_name = film_name;
    }

    public String getCinema_studio() {
        return cinema_studio;
    }

    public void setCinema_studio(String cinema_studio) {
        this.cinema_studio = cinema_studio;
    }

    public String getDate_film() {
        return date_film;
    }

    public void setDate_film(String date_film) {
        this.date_film = date_film;
    }

    public String getTime_film() {
        return time_film;
    }

    public void setTime_film(String time_film) {
        this.time_film = time_film;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

}

