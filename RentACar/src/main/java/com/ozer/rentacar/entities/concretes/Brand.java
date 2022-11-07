package com.ozer.rentacar.entities.concretes;

import com.ozer.rentacar.entities.abstracts.IEntity;
import lombok.*;

import javax.persistence.*;

//@Data // instead of @Getter & @Setter
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "brands")
@Entity
public class Brand implements IEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;
}
