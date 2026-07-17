package com.healthcare.demo.controller;

import com.healthcare.demo.entity.DonateBlood;
import com.healthcare.demo.service.DonateBloodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/donate-blood")
@CrossOrigin
public class DonateBloodController {
    @Autowired
    private DonateBloodService donateBloodService;

    @PostMapping
    public DonateBlood donateBlood(@RequestBody DonateBlood donateBlood) {
        return donateBloodService.saveDonation(donateBlood);
    }
}
