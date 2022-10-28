package com.ozer.rentacar.webAPI.controllers;

import com.ozer.rentacar.business.abstracts.IBrandService;
import com.ozer.rentacar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/brands/")
public class BrandsController {

    IBrandService brandService;

    @Autowired
    public BrandsController(IBrandService brandService) {
        this.brandService = brandService;
    }

    @GetMapping("getAll")
    public List<Brand> getAll() {
        return brandService.getAll();
    }
}
