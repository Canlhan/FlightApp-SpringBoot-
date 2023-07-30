package com.proje.pratikspringboot.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "airplane_company")
public class AirplaneCompany
{
    //manytomany ilişkide bir sorun var 3. tabloya verileri atamadım sonra halledicem
    @Id
    @GeneratedValue
    private Long id;


    @Column(name="company_name")
    private String aircompanyName;

    @ManyToMany(mappedBy ="airplanecompanies")

    private Set<Airplane> airplanes=new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "airplaneCompany")
    private Set<Flight> flights=new HashSet<>();

}
