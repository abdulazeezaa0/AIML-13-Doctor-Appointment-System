package com.healthcare.demo.repository;

import com.healthcare.demo.entity.MedicinePayment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicinePaymentRepository extends JpaRepository<MedicinePayment, Long> {
}
