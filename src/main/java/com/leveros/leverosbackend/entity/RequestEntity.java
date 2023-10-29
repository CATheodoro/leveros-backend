package com.leveros.leverosbackend.entity;

import jakarta.persistence.*;

import javax.validation.constraints.Min;

@Entity
@Table(name = "request_entity")
public class RequestEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "number")
    @Min(value = 100000, message = "O valor de 'number' deve ser no mínimo 10000")
    Integer number;

    @Column(name = "price")
    Double price;

    @Column(name = "status")
    @Enumerated(EnumType.ORDINAL)
    StatusEnum status;

    public RequestEntity() {
    }

    public RequestEntity(Integer number, Double price, StatusEnum status) {
        this.number = number;
        this.price = price;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "RequestEntity{" +
                "id=" + id +
                ", number=" + number +
                ", price=" + price +
                ", status=" + status +
                '}';
    }
}
