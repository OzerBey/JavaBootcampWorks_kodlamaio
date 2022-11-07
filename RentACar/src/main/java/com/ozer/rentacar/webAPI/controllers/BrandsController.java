package com.ozer.rentacar.webAPI.controllers;

import com.ozer.rentacar.business.abstracts.IBrandService;
import com.ozer.rentacar.business.requests.CreateBrandRequest;
import com.ozer.rentacar.business.responses.GetAllBrandResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/brands")
public class BrandsController {

    IBrandService brandService;

    @Autowired
    public BrandsController(IBrandService brandService) {
        this.brandService = brandService;
    }


    @PostMapping
    public void add(@RequestBody CreateBrandRequest brand) {
        brandService.add(brand);
    }

    @GetMapping
    public List<GetAllBrandResponse> getAll() {
        return brandService.getAll();
    }
}
