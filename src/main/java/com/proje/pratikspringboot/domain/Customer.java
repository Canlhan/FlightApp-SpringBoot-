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

    @OneToMany(cascade =CascadeType.ALL, mappedBy ="customer")
    private Set<Ticket> tickets=new HashSet<>();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Customer{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
