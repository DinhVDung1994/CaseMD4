package com.example.casemd4_canhan.controller.movie;

import com.example.casemd4_canhan.model.movie.Film;
import com.example.casemd4_canhan.service.movie.IDirectorService;
import com.example.casemd4_canhan.service.movie.IFilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/movie")
public class APIMovie {
    @Autowired
    IFilmService filmService;
    @Autowired
    IDirectorService directorService;

    @GetMapping("/anime")
    public ResponseEntity<List<Film>> fimlAnime() {
        return new ResponseEntity<>(filmService.findFimlAnime(), HttpStatus.OK);
    }

    @GetMapping("/action")
    public ResponseEntity<List<Film>> fimlsKinhDi() {
        return new ResponseEntity<>(filmService.findFimlKinhDi(), HttpStatus.OK);
    }

    @GetMapping("/rap")
    public ResponseEntity<List<Film>> fimlsRap() {
        return new ResponseEntity<>(filmService.findFimlRap(), HttpStatus.OK);
    }

    @GetMapping("/le")
    public ResponseEntity<List<Film>> fimlsle() {
        return new ResponseEntity<>(filmService.findFimlLeHot(), HttpStatus.OK);
    }

    @GetMapping("/bo")
    public ResponseEntity<List<Film>> fimlsbo() {
        return new ResponseEntity<>(filmService.findFimlBoHot(), HttpStatus.OK);
    }

    @GetMapping("/details/{id}")
    public ResponseEntity<Film> details(@PathVariable int id) {
        return new ResponseEntity<>(filmService.findById(id), HttpStatus.OK);
    }

    @GetMapping("/showall")
    public ResponseEntity<List<Film>> showAllFiml() {
        return new ResponseEntity<>(filmService.findAll(), HttpStatus.OK);
    }
@PutMapping("/savefiml/{id}")
    public void save(@RequestBody Film film){
        filmService.save(film);
}

}
