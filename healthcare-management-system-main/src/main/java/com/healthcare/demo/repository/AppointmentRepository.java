package com.healthcare.demo.repository;
import java.util.List;

import com.healthcare.demo.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
	List<Appointment> findByDoctor(String doctor);
	List<Appointment> findByEmail(String email);
}
