package com.ozer.rentacar.dataAccess.abstracts;

import com.ozer.rentacar.entities.concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBrandRepository extends JpaRepository<Brand, Integer> {
}
