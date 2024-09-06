package com.exercise.microservice.user_service.Entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name ="users")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Benzersiz kullanıcı ID

    @Column(nullable = false, unique = true)
    private String username; // Kullanıcı adı (benzersiz)

    @Column(nullable = false)
    private String password; // Kullanıcı şifresi (hash'lenmiş)

    @Column(nullable = false, unique = true)
    private String email; // E-posta (benzersiz)

    @Column(nullable = false)
    private String firstName; // Kullanıcının adı

    @Column(nullable = false)
    private String lastName; // Kullanıcının soyadı

    @Column
    private String phoneNumber; // Kullanıcının telefon numarası

    @Column
    private String address; // Kullanıcının adresi

    @Column
    private String city; // Kullanıcının yaşadığı şehir

    @Column
    private String country; // Kullanıcının yaşadığı ülke

    @Column
    private String postalCode; // Kullanıcının posta kodu

    @Column
    private LocalDateTime dateOfBirth; // Kullanıcının doğum tarihi

    @Column(nullable = false)
    private Boolean isActive; // Kullanıcının aktif/pasif durumu

    @Column
    private LocalDateTime registrationDate; // Kullanıcının sisteme kayıt olduğu tarih

    @Column
    private LocalDateTime lastLoginDate; // Kullanıcının en son giriş yaptığı tarih


    public User(Long id,
                String username,
                String password,
                String email,
                String firstName,
                String lastName,
                String phoneNumber,
                String address,
                String city,
                String country,
                String postalCode,
                LocalDateTime dateOfBirth,
                Boolean isActive,
                LocalDateTime registrationDate,
                LocalDateTime lastLoginDate) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.city = city;
        this.country = country;
        this.postalCode = postalCode;
        this.dateOfBirth = dateOfBirth;
        this.isActive = isActive;
        this.registrationDate = registrationDate;
        this.lastLoginDate = lastLoginDate;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.registrationDate = registrationDate;
    }

    public LocalDateTime getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(LocalDateTime lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", isActive=" + isActive +
                ", registrationDate=" + registrationDate +
                ", lastLoginDate=" + lastLoginDate +
                '}';
    }
}
