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

    @ManyToMany
    @JoinTable(name="plane_company" ,joinColumns = @JoinColumn(name="plane_id"),
            inverseJoinColumns = @JoinColumn(name="aircompany_id"))
    private Set<AirplaneCompany> airplanecompanies=new HashSet<>();

    public void addAirplaneCompany(AirplaneCompany airplaneCompany)
    {
       this.airplanecompanies.add(airplaneCompany);
        airplaneCompany.getAirplanes().add(this);
    }


}
