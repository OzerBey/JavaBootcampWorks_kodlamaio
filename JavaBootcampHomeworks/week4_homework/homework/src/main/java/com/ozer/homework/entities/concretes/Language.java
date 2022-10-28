package com.ozer.homework.entities.concretes;

import com.ozer.homework.entities.abstracts.IEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Language implements IEntity {
    private int id;
    private String name;
}
