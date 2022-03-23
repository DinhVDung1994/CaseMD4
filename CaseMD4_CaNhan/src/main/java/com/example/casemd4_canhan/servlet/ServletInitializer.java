package com.example.casemd4_canhan.servlet;

import com.example.casemd4_canhan.CaseMd4CaNhanApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(CaseMd4CaNhanApplication.class);
    }

}
