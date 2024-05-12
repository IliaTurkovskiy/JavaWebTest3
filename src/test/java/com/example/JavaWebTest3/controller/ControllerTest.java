package com.example.JavaWebTest3.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;
import org.springframework.web.servlet.ModelAndView;

import static org.junit.jupiter.api.Assertions.*;

class ControllerTest {

    @Test
    void getStartPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index.html");
        assertEquals(modelAndView.getViewName(), "index.html");
    }
}