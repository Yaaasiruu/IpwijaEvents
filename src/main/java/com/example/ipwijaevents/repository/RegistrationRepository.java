package com.example.ipwijaevents.repository;

import com.example.ipwijaevents.entity.Registration;
import com.example.ipwijaevents.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegistrationRepository extends JpaRepository<Registration, Long> {

    List<Registration> findByUser(User user);

}
