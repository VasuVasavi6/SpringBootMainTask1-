package com.dailycodebuffer.jwt.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dailycodebuffer.jwt.entity.OrderLine;

@Service
public interface OrderLineService {

	List<OrderLine> fetchOrderLine();

	OrderLine saveOrderLine(OrderLine order);
}
