package com.example.springboot01.repository;

import com.example.springboot01.domain.Film;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface FilmRepository extends JpaRepository<Film,Long>{

}
