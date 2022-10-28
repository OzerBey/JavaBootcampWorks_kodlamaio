package com.ozer.rentacar.business.abstracts;

import com.ozer.rentacar.entities.concretes.Brand;

import java.util.List;

public interface IBrandService {

    List<Brand> getAll();
}
