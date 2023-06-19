package com.dailycodebuffer.jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dailycodebuffer.jwt.entity.OrderLine;

@Repository
public interface OrderLineRepo extends JpaRepository<OrderLine, Long> {

}
