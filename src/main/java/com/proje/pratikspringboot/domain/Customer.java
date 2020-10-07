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
@Table(name="cutomer")
public class Customer
{
    @Id
    @GeneratedValue
    private Long id;

    @Column(name ="name")
    private String name;

    @ManyToMany(cascade = CascadeType.ALL,mappedBy ="customers")
    private Set<Ticket> tickets=new HashSet<>();
}
