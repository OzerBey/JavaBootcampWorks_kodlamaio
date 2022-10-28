package com.ozer.rentacar.business.concretes;

import com.ozer.rentacar.business.abstracts.IBrandService;
import com.ozer.rentacar.dataAccess.abstracts.IBrandRepository;
import com.ozer.rentacar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandManager implements IBrandService {
    // Business rules here
    private final IBrandRepository brandRepository;

    @Autowired
    public BrandManager(IBrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<Brand> getAll() {
        return brandRepository.getAll();
    }
}
