package br.com.fiap.abctechapi.entity;


import jdk.jfr.Relational;

import javax.persistence.*;
import java.lang.reflect.Array;
import java.util.List;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long operatorId;
    @OneToMany
    private List<Assistance> assistances;
    @OneToOne
    @JoinColumn(name = "start_order_location_id",foreignKey = @ForeignKey(name = "fk_start_order_id"))
    private OrderLocation startOrderLocation;
    @OneToOne
    @JoinColumn(name = "end_order_location_id",foreignKey = @ForeignKey(name = "fk_end_order_id"))
    private OrderLocation endOrderLocation;

}
