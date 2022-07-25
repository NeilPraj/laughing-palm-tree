package com.example.onetomanyex.entities;

import javax.persistence.*;

@Entity
@Table (name = "Addresses")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "adr_id")
    private Long adr_id;
    private Integer years_lived;
    private String status;
    //current address or seperate address

    public Long getAdr_id() {
        return adr_id;
    }

    public void setAdr_id(Long adr_id) {
        this.adr_id = adr_id;
    }

    public Integer getYears_lived() {
        return years_lived;
    }

    public void setYears_lived(Integer years_lived) {
        this.years_lived = years_lived;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Address{" +
                "adr_id=" + adr_id +
                ", years_lived=" + years_lived +
                ", status='" + status + '\'' +
                '}';
    }
}
