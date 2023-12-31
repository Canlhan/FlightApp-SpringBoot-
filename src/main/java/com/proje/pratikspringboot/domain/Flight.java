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
@Table(name="flight")
public class Flight
{
    @Id
    @GeneratedValue
    private  Long id;

    @OneToOne
    @JoinColumn(name = "route_id")
    private Route route;


    @OneToMany(cascade = CascadeType.ALL,mappedBy ="flight")
    private Set<Ticket> tickets=new HashSet<>();

    @ManyToOne
    @JoinColumn(name ="airplanecompany_id")
    private AirplaneCompany airplaneCompany;

    private String flightname;
}
