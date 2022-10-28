package com.ozer.rentacar.dataAccess.abstracts;

import com.ozer.rentacar.entities.concretes.Brand;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface IBrandRepository {
    List<Brand> getAll();
}
