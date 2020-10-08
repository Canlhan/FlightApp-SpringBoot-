package com.proje.pratikspringboot.domain;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@ToString
@Table(name="airplane")
public class Airplane
{
    @Id
    @GeneratedValue
    private Long id;

    @Column(name="airplane_name")
    private String airplaneName;

    @ManyToMany(cascade = CascadeType.ALL,mappedBy ="airplanes")
    private Set<AirplaneCompany> airplanecompanies=new HashSet<>();



}
