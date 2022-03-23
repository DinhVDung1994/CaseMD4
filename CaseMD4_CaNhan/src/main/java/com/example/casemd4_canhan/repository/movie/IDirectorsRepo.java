package com.example.casemd4_canhan.repository.movie;

import com.example.casemd4_canhan.model.movie.Directors;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface IDirectorsRepo extends PagingAndSortingRepository<Directors,Long> {
    @Query(nativeQuery = true, value = "select * from tacgia where nametacgia like concat ('%'+:name+'%')")
    public List<Directors> findAllFimlByNameDirector(@Param("name") String name);
}
