package com.ozer.rentacar.dataAccess.concretes;

import com.ozer.rentacar.dataAccess.abstracts.IBrandRepository;
import com.ozer.rentacar.entities.concretes.Brand;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryBrandRepository implements IBrandRepository {

    List<Brand> brands;

    public InMemoryBrandRepository() {
        brands = new ArrayList<>();
        brands.add(new Brand(1, "BMW"));
        brands.add(new Brand(2, "Mercedes"));
        brands.add(new Brand(3, "Audi"));
        brands.add(new Brand(4, "Volvo"));
        brands.add(new Brand(5, "Renault"));
    }

    @Override
    public List<Brand> getAll() {
        return brands;
    }
}
