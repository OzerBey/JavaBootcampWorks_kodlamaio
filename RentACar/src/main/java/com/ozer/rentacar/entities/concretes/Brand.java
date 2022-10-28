package com.ozer.rentacar.entities.concretes;

import com.ozer.rentacar.entities.abstracts.IEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Brand implements IEntity {

    private int id;
    private String name;
}
