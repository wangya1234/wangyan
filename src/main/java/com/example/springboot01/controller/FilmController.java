package com.example.springboot01.controller;

import com.example.springboot01.domain.Film;
import com.example.springboot01.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FilmController {
    @Autowired
    private FilmRepository filmRepository;
    @RequestMapping("/selFilm")
    public List<Film>  selFilm(){
        //Film film = filmRepository.findOne(1L);
         List<Film> films =  filmRepository.findAll();
        return films;
    }
   @RequestMapping("/inseFilm")
    public void inseFilm(){
        Film film = new Film();

        filmRepository.save(film);
    }

}
