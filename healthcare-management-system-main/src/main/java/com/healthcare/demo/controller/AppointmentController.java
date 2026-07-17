package com.healthcare.demo.controller;
import java.util.List;
import java.util.Map;

import com.healthcare.demo.entity.Appointment;
import com.healthcare.demo.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/appointments")
@CrossOrigin
public class AppointmentController {
    // Get department-wise bookings for the logged-in doctor
    @GetMapping("/doctor/departments")
    public Map<String, List<Appointment>> getDepartmentWiseBookings(@RequestParam(required = false) String doctor) {
        // If doctor param is not provided, return all bookings grouped by department
        return appointmentService.getDepartmentWiseBookings(doctor);
    }
    @Autowired
    private AppointmentService appointmentService;

    @PostMapping
    public Appointment bookAppointment(@RequestBody Appointment appointment) {
        return appointmentService.bookAppointment(appointment);
    }

    @GetMapping("/user/{email}")
    public List<Appointment> getAppointmentsByEmail(@PathVariable String email) {
        return appointmentService.getAppointmentsByEmail(email);
    }
}
