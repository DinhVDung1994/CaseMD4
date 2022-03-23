package com.example.casemd4_canhan.service.movie;

import com.example.casemd4_canhan.model.movie.Directors;
import com.example.casemd4_canhan.repository.movie.IDirectorsRepo;
import com.example.casemd4_canhan.repository.movie.IFilmRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DirectorService implements IDirectorService{
    @Autowired
    IDirectorsRepo directorsRepo;

    @Override
    public Page<Directors> findAll(Pageable pageable) {
        return directorsRepo.findAll(pageable);
    }

    @Override
    public void save(Directors directors) {
directorsRepo.save(directors);
    }

    @Override
    public Optional<Directors> findById(long id) {
        return directorsRepo.findById(id);
    }

    @Override
    public List<Directors> findDirecterByName(String name) {
        return directorsRepo.findAllFimlByNameDirector(name);
    }
}
