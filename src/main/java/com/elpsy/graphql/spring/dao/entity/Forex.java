package com.elpsy.graphql.spring.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;

@Data
@EqualsAndHashCode
@Entity
@Builder
@AllArgsConstructor
public class Forex implements Serializable {

    public Forex() {
    }

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String code;
    private String type;
    private Double price;
    private Double high;
    private Double low;
    private Double percentage;
    private String bias;


}
