package com.ecom.Enitity;
import java.util.*;

import com.ecom.Domain.USERROLE;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY) //the system cannot read this field
    private String password;

    private String email;
    private String fullname;
    private int mobilenumber;
    private USERROLE role = USERROLE.ROLE_CUSTOMER;
    private Set<Address> addresses = new HashSet<>(); //update it to a set<String ,address>, such that work: adress, home: address
    private Set<Coupon> usedcoupons = new HashSet<>();

    
}
