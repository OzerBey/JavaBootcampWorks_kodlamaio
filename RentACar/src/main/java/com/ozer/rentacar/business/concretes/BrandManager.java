package com.ozer.rentacar.business.concretes;

import com.ozer.rentacar.business.abstracts.IBrandService;
import com.ozer.rentacar.business.requests.CreateBrandRequest;
import com.ozer.rentacar.business.responses.GetAllBrandResponse;
import com.ozer.rentacar.dataAccess.abstracts.IBrandRepository;
import com.ozer.rentacar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    public void add(CreateBrandRequest brandRequest) {
        Brand brand = new Brand();
        brand.setName(brandRequest.getName());
        this.brandRepository.save(brand);
    }

    @Override
    public List<GetAllBrandResponse> getAll() {
        List<Brand> brands = brandRepository.findAll();
        List<GetAllBrandResponse> brandResponses = new ArrayList<>();
        //mapping
        for (Brand brand : brands) {
            GetAllBrandResponse responseItem = new GetAllBrandResponse();
            responseItem.setId(brand.getId());
            responseItem.setName(brand.getName());
            brandResponses.add(responseItem);
        }
        return brandResponses;
    }
}
