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
@Table(name = "ticket")
public class Ticket
{
    @Id
    @GeneratedValue
    private Long id;

    @Column(name ="ticketnum")
    private String ticketnum;

    @Column(name = "rota")
    private String rota;

    @Column(name = "time")
    private String time;

    @ManyToOne
    private Flight flight;

    @ManyToMany
    @JoinTable(name="customer_ticket",joinColumns = @JoinColumn(name ="ticket_id"),
            inverseJoinColumns = @JoinColumn(name ="customer_id"))
    private Set<Customer> customers;



}
