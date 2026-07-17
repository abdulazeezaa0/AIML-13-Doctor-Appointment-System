package com.healthcare.demo.repository;

import com.healthcare.demo.entity.MedicineOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicineOrderRepository extends JpaRepository<MedicineOrder, Long> {
}
