package com.example.casemd4_canhan.service.movie;

import com.example.casemd4_canhan.model.movie.Directors;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IDirectorService {
    public Page<Directors> findAll(Pageable pageable);
    public void save(Directors directors);
    public Optional<Directors> findById(long id);
    public List<Directors> findDirecterByName(String name);
}
