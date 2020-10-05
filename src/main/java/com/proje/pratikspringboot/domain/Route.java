package com.proje.pratikspringboot.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@AllArgsConstructor
@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name ="route")
public class Route
{
    @Id
    @GeneratedValue
    private Long id;

    @Column(name ="fromm")
    private String from;

    @Column(name ="to")
    private String to;


}
