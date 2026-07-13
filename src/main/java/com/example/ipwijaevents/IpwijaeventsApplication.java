package com.example.ipwijaevents;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.ipwijaevents.entity.User;
import com.example.ipwijaevents.repository.UserRepository;
import com.example.ipwijaevents.service.UserService;

@SpringBootApplication
public class IpwijaeventsApplication {

    public static void main(String[] args) {
        SpringApplication.run(IpwijaeventsApplication.class, args);
    }

    @Bean
    public CommandLineRunner dataInitializer(UserRepository userRepository, UserService userService) {
        return args -> {
            if (userRepository.count() == 0) {
                // Seed Admin
                User admin = new User();
                admin.setNama("Admin Ipwija");
                admin.setNim("ADMIN001");
                admin.setEmail("admin@ipwija.ac.id");
                admin.setPassword("admin123");
                admin.setProdi("Sistem Informasi");
                admin.setKelas("Admin");
                admin.setRole("ADMIN");
                userService.save(admin);

                // Seed Mahasiswa
                User mhs = new User();
                mhs.setNama("Mahasiswa Ipwija");
                mhs.setNim("MHS001");
                mhs.setEmail("mhs@ipwija.ac.id");
                mhs.setPassword("mhs123");
                mhs.setProdi("Teknik Informatika");
                mhs.setKelas("Reguler A");
                mhs.setRole("MAHASISWA");
                userService.save(mhs);

                System.out.println("Data seeding sukses: Admin & Mahasiswa berhasil ditambahkan!");
            }
        };
    }
}
