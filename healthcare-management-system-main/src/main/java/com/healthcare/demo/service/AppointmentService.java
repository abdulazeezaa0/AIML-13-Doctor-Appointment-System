package com.healthcare.demo.service;
import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.ArrayList;

import com.healthcare.demo.entity.Appointment;
import com.healthcare.demo.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService {
    // Group appointments by department for a doctor
    public Map<String, List<Appointment>> getDepartmentWiseBookings(String doctor) {
        List<Appointment> all;
        if (doctor != null && !doctor.isEmpty()) {
            all = appointmentRepository.findByDoctor(doctor);
        } else {
            all = appointmentRepository.findAll();
        }
        Map<String, List<Appointment>> grouped = new LinkedHashMap<>();
        for (Appointment a : all) {
            String dept = a.getDepartment();
            grouped.computeIfAbsent(dept, k -> new ArrayList<>()).add(a);
        }
        return grouped;
    }
    @Autowired
    private AppointmentRepository appointmentRepository;

    public Appointment bookAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    public List<Appointment> getAppointmentsByEmail(String email) {
        return appointmentRepository.findByEmail(email);
    }
}
