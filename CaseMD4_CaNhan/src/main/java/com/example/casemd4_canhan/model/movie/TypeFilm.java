package com.example.casemd4_canhan.model.movie;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "theloai")
public class TypeFilm {
    @Id
    private int idTypeFilm;
    private String nameTypeFilm;
}
