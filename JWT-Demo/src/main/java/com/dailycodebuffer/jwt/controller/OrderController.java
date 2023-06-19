package com.dailycodebuffer.jwt.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dailycodebuffer.jwt.dto.OrderRequestDTO;
import com.dailycodebuffer.jwt.entity.Order;
import com.dailycodebuffer.jwt.service.OrderService;

@RestController
@RequestMapping("/api")
public class OrderController {
	@Autowired
	private OrderService orderService;

	public OrderController(OrderService orderService) {
		this.orderService = orderService;
	}

	@PostMapping("/v1/orders/create")
	public Order createOrder(@RequestBody OrderRequestDTO request) {
		Order order = new Order();
		order.setCustName(request.getCustname());
		order.setOrderLines(request.getOrderline());
		order.setDate(LocalDateTime.now());
		orderService.calculateOrderTotals(order);
		Order savedOrder = orderService.save(order);
		return savedOrder;
	}

	@GetMapping("/v1/orders/fetch")
	public List<Order> fetchCategory() {
		return orderService.fetchOrders();
	}

}
