package com.example.casemd4_canhan.service.movie;

import com.example.casemd4_canhan.model.movie.Film;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IFilmService {
    public List<Film> findAll();
    public Page<Film> findAll(Pageable pageable);
    public void save(Film film);
    public void delete(int id);
    public Film findById(int id);
    public List<Film> findFilmByName(String name);
    public List<Film> findFimlAnime();
    public List<Film> findFimlRap();
    public List<Film> findFimlKinhDi();
    public List<Film> findFimlLeHot();
    public List<Film> findFimlBoHot();
}
