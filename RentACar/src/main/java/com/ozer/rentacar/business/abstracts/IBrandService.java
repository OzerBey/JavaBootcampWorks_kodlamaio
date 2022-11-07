package com.ozer.rentacar.business.abstracts;

import com.ozer.rentacar.business.requests.CreateBrandRequest;
import com.ozer.rentacar.business.responses.GetAllBrandResponse;

import java.util.List;

public interface IBrandService {

    void add(CreateBrandRequest brandRequest);

    List<GetAllBrandResponse> getAll();
}
