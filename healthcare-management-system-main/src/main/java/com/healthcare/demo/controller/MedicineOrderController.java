package com.healthcare.demo.controller;

import com.healthcare.demo.entity.MedicineOrder;
import com.healthcare.demo.service.MedicineOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/medicine-orders")
@CrossOrigin
public class MedicineOrderController {
    @Autowired
    private MedicineOrderService medicineOrderService;

    @PostMapping
    public MedicineOrder placeOrder(@RequestBody MedicineOrder order) {
        return medicineOrderService.placeOrder(order);
    }
}
