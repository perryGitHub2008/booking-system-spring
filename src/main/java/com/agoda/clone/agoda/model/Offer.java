package com.agoda.clone.agoda.model;

import java.time.Instant;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Offer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    private int guest;
    private int kid;
    private int kidage;
    private int quantity;
    private int canceldeadline;
    private Date checkindate;
    private Date checkoutdate;
    private double price;
    private String Createdby;
    private Instant Createdat;
    private String Modifiedby;
    private Instant Modifiedat;
    private String Deletedby;
    private Instant Deletedat;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "roomid")
    @ToString.Exclude
    private Room room;


    @JsonManagedReference
    @OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "offer")
    private List<Booking> bookings;

    @JsonManagedReference
    @OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "offer")
    private List<Benefit> benefit;
}
