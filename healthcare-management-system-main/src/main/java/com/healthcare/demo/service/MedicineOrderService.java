package com.healthcare.demo.service;

import com.healthcare.demo.entity.MedicineOrder;
import com.healthcare.demo.repository.MedicineOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicineOrderService {
    @Autowired
    private MedicineOrderRepository medicineOrderRepository;

    public MedicineOrder placeOrder(MedicineOrder order) {
        return medicineOrderRepository.save(order);
    }
}
