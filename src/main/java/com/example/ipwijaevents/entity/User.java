package com.example.ipwijaevents.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nama;

    @Column(nullable = false, unique = true)
    private String nim;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String prodi;

    @Column(nullable = false)
    private String kelas;

    @Column(nullable = false)
    private String role;

    public User() {
    }

    public User(Long id, String nama, String nim, String email, String password,
                String prodi, String kelas, String role) {
        this.id = id;
        this.nama = nama;
        this.nim = nim;
        this.email = email;
        this.password = password;
        this.prodi = prodi;
        this.kelas = kelas;
        this.role = role;
    }

    // ==========================
    // GETTER
    // ==========================

    public Long getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getProdi() {
        return prodi;
    }

    public String getKelas() {
        return kelas;
    }

    public String getRole() {
        return role;
    }

    // ==========================
    // SETTER
    // ==========================

    public void setId(Long id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public void setRole(String role) {
        this.role = role;
    }

    // ==========================
    // toString()
    // ==========================

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nama='" + nama + '\'' +
                ", nim='" + nim + '\'' +
                ", email='" + email + '\'' +
                ", prodi='" + prodi + '\'' +
                ", kelas='" + kelas + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    // ==========================
    // equals()
    // ==========================

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        User user = (User) obj;

        return id != null && id.equals(user.id);
    }

    // ==========================
    // hashCode()
    // ==========================

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

}