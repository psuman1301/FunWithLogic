package com.suman.ashish.controller;

import com.suman.ashish.service.LogicalServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
@RequestMapping("/logical")
public class LogicalController {

    @Autowired
    private LogicalServiceImpl service;

    @GetMapping("/string/{id}/{str}")
    public String stringPrograms(@PathVariable String id,@PathVariable String str){
        String solution= service.getStringSolution(id,str);
        return solution;
    }

    @GetMapping("/number/{id}/{number}")
    public String numberPrograms(@PathVariable String id, @PathVariable String number){
        String solution= service.getNumberSolution(id, Integer.valueOf(number));
        return solution;
    }

    @GetMapping("/array/{id}/{array}")
    public List  arrayPrograms(@PathVariable String id,@PathVariable List array){
        List solution=service.getArraySolution(id, array);
        return solution;
    }
}
