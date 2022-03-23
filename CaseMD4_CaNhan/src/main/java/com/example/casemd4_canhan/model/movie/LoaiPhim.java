package com.example.casemd4_canhan.model.movie;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "loaiphim")
public class LoaiPhim {
    @Id
    private Long id;
    private String nameLoai;
}
