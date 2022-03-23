package com.example.casemd4_canhan.repository.movie;

import com.example.casemd4_canhan.model.movie.Film;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IFilmRepo extends PagingAndSortingRepository<Film,Integer> {
    @Query(nativeQuery = true,value = "select * from phim where namephim like concat('%',:name,'%')")
    public List<Film> findAllFilmByName(@Param("name") String name);
    @Query(nativeQuery = true,value = "select * from phim where type_film_id_type_film =3 limit 4")
    public List<Film> findAllFilmAnime();
    @Query(nativeQuery = true,value = "select * from phim where type_film_id_type_film =2 limit 4")
    public List<Film> findAllFilRap();
    @Query(nativeQuery = true,value = "select * from phim where type_film_id_type_film =4 limit 4")
    public List<Film> findAllFilmKinhDi();
    @Query(nativeQuery = true,value = "select * from phim where loai_phim_id =2")
    public List<Film> findAllFilmLeHot();
    @Query(nativeQuery = true,value = "select * from phim where loai_phim_id =1")
    public List<Film> findAllFilmBoHot();
}
