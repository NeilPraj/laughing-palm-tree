package com.example.onetomanyex.repos;

import com.example.onetomanyex.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}