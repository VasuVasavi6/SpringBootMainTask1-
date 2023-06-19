package com.dailycodebuffer.jwt.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dailycodebuffer.jwt.entity.Order;

@Service
public interface OrderService {

	void calculateOrderTotals(Order order);

	List<Order> fetchOrders();

	Order save(Order order);

	Order saveOrder(Order order);
}
