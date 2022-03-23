package com.example.casemd4_canhan.model.movie;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "hinhthucchieuphim")
public class CachChieu {
    @Id
    private Long id;
    private String cachchieu;
}
