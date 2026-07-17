package com.healthcare.demo.controller;

import com.healthcare.demo.entity.MedicinePayment;
import com.healthcare.demo.service.MedicinePaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/medicine-payments")
@CrossOrigin
public class MedicinePaymentController {
    @Autowired
    private MedicinePaymentService medicinePaymentService;

    @PostMapping
    public MedicinePayment makePayment(@RequestBody MedicinePayment payment) {
        return medicinePaymentService.makePayment(payment);
    }
}
