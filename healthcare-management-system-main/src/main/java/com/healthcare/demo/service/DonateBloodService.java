package com.healthcare.demo.service;

import com.healthcare.demo.entity.DonateBlood;
import com.healthcare.demo.repository.DonateBloodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DonateBloodService {
    @Autowired
    private DonateBloodRepository donateBloodRepository;

    public DonateBlood saveDonation(DonateBlood donateBlood) {
        return donateBloodRepository.save(donateBlood);
    }
}
