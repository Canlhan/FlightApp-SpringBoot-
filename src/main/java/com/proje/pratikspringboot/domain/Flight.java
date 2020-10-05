package com.proje.pratikspringboot.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
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
    private Set<Ticket> tickets;

    @ManyToOne
    private AirplaneCompany airplaneCompany;

    private String flightname;
}
