package com.healthcare.demo.service;

import com.healthcare.demo.entity.MedicinePayment;
import com.healthcare.demo.repository.MedicinePaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicinePaymentService {
    @Autowired
    private MedicinePaymentRepository medicinePaymentRepository;

    public MedicinePayment makePayment(MedicinePayment payment) {
        return medicinePaymentRepository.save(payment);
    }
}
