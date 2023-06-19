package com.dailycodebuffer.jwt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dailycodebuffer.jwt.entity.OrderLine;
import com.dailycodebuffer.jwt.service.OrderLineService;

@RestController
@RequestMapping("/api")
public class OrderLineController {

	@Autowired
	private OrderLineService orderLineService;

	@GetMapping("/v1/orderline/fetch")
	public List<OrderLine> fetchCategory() {
		return orderLineService.fetchOrderLine();
	}

	@PostMapping("/v1/orderline/create")
	public OrderLine saveOrder(@RequestBody OrderLine orderline) {
		return orderLineService.saveOrderLine(orderline);

	}
}
