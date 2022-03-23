package com.example.casemd4_canhan.model.movie;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

@Entity
@Data
@Table(name = "tacgia")
public class Directors implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDirector;
    private String nameDirector;
    private String birthday;
    private String countryside;

    @Override
    public String getAuthority() {
        return nameDirector;
    }
}
