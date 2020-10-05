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
    @Id
    @GeneratedValue
    private Long id;

    @Column(name="company_name")
    private String aircompanyName;

    @ManyToMany(cascade = CascadeType.ALL,mappedBy ="airplanecompanies" )
    private Set<Airplane> airplanes;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "airplaneCompany")
    private Set<Flight> flights;

}
