package com.example.turtlesportbe.model;

import com.example.turtlesportbe.model.auth.Account;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "customer,ms")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Column(name = "birthday")
    private String birthDay;
    private String phoneNumber;
    private String email;
    private String address;
    @Column(name = "is_deleted", columnDefinition = "int(1) default 0")
    private boolean isDeleted;
    @OneToOne
    @JoinColumn(name = "accountId", referencedColumnName = "accountId")
    private Account account;
    @OneToMany(mappedBy = "customer")
    private Set<Booking> bookingSet;
    @OneToMany(mappedBy = "customer")
    private Set<Cart> cartSet;

    public Customer() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Set<Booking> getBookingSet() {
        return bookingSet;
    }

    public void setBookingSet(Set<Booking> bookingSet) {
        this.bookingSet = bookingSet;
    }

    public Set<Cart> getCartSet() {
        return cartSet;
    }

    public void setCartSet(Set<Cart> cartSet) {
        this.cartSet = cartSet;
    }
}

