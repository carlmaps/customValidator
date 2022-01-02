package com.example.CustomValidator.repository;

import com.example.CustomValidator.model.FieldTrip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FieldTripRepository extends JpaRepository<FieldTrip, Long> {
}
