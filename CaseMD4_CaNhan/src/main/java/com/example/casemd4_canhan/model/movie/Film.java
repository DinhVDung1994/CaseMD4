package com.example.casemd4_canhan.model.movie;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "phim")
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_film")
    private int idFilm;
    private String nameFilm;
    private String imgFilm;
    @ManyToOne
    private TypeFilm typeFilm;
    private String year;
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Directors> directors;
    @ManyToOne
    private CachChieu cachChieu;
    @ManyToOne
    private LoaiPhim loaiPhim;

    public Film() {
    }

    public Film(int idFilm, String nameFilm, String imgFilm, TypeFilm typeFilm, String year, List<Directors> directors, CachChieu cachChieu, LoaiPhim loaiPhim) {
        this.idFilm = idFilm;
        this.nameFilm = nameFilm;
        this.imgFilm = imgFilm;
        this.typeFilm = typeFilm;
        this.year = year;
        this.directors = directors;
        this.cachChieu = cachChieu;
        this.loaiPhim = loaiPhim;
    }

    public int getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(int idFilm) {
        this.idFilm = idFilm;
    }

    public String getNameFilm() {
        return nameFilm;
    }

    public void setNameFilm(String nameFilm) {
        this.nameFilm = nameFilm;
    }

    public String getImgFilm() {
        return imgFilm;
    }

    public void setImgFilm(String imgFilm) {
        this.imgFilm = imgFilm;
    }

    public TypeFilm getTypeFilm() {
        return typeFilm;
    }

    public void setTypeFilm(TypeFilm typeFilm) {
        this.typeFilm = typeFilm;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public List<Directors> getDirectors() {
        return directors;
    }

    public void setDirectors(List<Directors> directors) {
        this.directors = directors;
    }

    public CachChieu getCachChieu() {
        return cachChieu;
    }

    public void setCachChieu(CachChieu cachChieu) {
        this.cachChieu = cachChieu;
    }

    public LoaiPhim getLoaiPhim() {
        return loaiPhim;
    }

    public void setLoaiPhim(LoaiPhim loaiPhim) {
        this.loaiPhim = loaiPhim;
    }
}
