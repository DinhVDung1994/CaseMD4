package com.example.casemd4_canhan.service.movie;

import com.example.casemd4_canhan.model.movie.Film;
import com.example.casemd4_canhan.repository.movie.IFilmRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FimlService implements IFilmService {
    @Autowired
    IFilmRepo filmRepo;

    @Override
    public List<Film> findAll() {
        return (List<Film>) filmRepo.findAll();
    }

    @Override
    public Page<Film> findAll(Pageable pageable) {
        return filmRepo.findAll(pageable);
    }

    @Override
    public void save(Film film) {
        filmRepo.save(film);
    }

    @Override
    public void delete(int id) {
        filmRepo.deleteById(id);
    }


    @Override
    public Film findById(int id) {
        return filmRepo.findById(id).get();
    }

    @Override
    public List<Film> findFilmByName(String name) {
        return filmRepo.findAllFilmByName(name);
    }

    @Override
    public List<Film> findFimlAnime() {
        return filmRepo.findAllFilmAnime();
    }

    @Override
    public List<Film> findFimlRap() {
        return filmRepo.findAllFilRap();
    }

    @Override
    public List<Film> findFimlKinhDi() {
        return filmRepo.findAllFilmKinhDi();
    }

    @Override
    public List<Film> findFimlLeHot() {
        return filmRepo.findAllFilmLeHot();
    }

    @Override
    public List<Film> findFimlBoHot() {
        return filmRepo.findAllFilmBoHot();
    }


}
