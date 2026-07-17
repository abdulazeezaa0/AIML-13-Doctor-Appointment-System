package com.healthcare.demo.repository;

import com.healthcare.demo.entity.DonateBlood;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonateBloodRepository extends JpaRepository<DonateBlood, Long> {
}
