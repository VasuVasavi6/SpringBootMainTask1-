package com.dailycodebuffer.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dailycodebuffer.jwt.entity.OrderLine;
import com.dailycodebuffer.jwt.repository.OrderLineRepo;

@Service
public class OrderLineServiceImpl implements OrderLineService {

	@Autowired
	private OrderLineRepo OrderLineRepository;

	@Override
	public List<OrderLine> fetchOrderLine() {
		// TODO Auto-generated method stub
		return OrderLineRepository.findAll();
	}

	@Override
	public OrderLine saveOrderLine(OrderLine order) {
		// TODO Auto-generated method stub
		return OrderLineRepository.save(order);
	}

}
