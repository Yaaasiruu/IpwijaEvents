package com.example.ipwijaevents.repository;

import com.example.ipwijaevents.entity.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendanceRepository extends JpaRepository<Attendance, Long> {

}
