package com.tisp.accounts.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
//A class of type Entity indicates a class that, at an abstract level, is correlated with a table in the database
//@Table(name=customer)
@Getter @Setter @ToString
@AllArgsConstructor
//Parameterized Constructor
@NoArgsConstructor
//Non-Parameterized Constructor

public class Customer extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator="native")
    //@GenericGenerator(name="native",strategy="native")
    @Column(name="customer_id")
    private Long customerId;
    @Column(name="name")
    private String name;
    @Column(name="email")
    private String email;
    @Column(name="mobile_number")
    private String mobileNumber;
}
