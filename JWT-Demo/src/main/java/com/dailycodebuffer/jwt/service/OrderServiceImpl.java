package com.dailycodebuffer.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dailycodebuffer.jwt.entity.Order;
import com.dailycodebuffer.jwt.entity.OrderLine;
import com.dailycodebuffer.jwt.repository.OrderRepo;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepo OrderRepository;

	@Override
	public void calculateOrderTotals(Order order) {
		Double total = 0.0;
		Double tax = 0.0;
		List<OrderLine> items = order.getOrderLines();
		for (OrderLine item : items) {
			item.setOrder(order);
			total += item.getAmount();
			tax += item.getTax();
		}
		order.setTotalprice(total);
		order.setTotaltax(tax);
		order.setGrosstotal(total + tax);
	}

	@Override
	public List<Order> fetchOrders() {
		// TODO Auto-generated method stub
		return OrderRepository.findAll();
	}

	@Override
	public Order save(Order order) {
		// TODO Auto-generated method stub
		return OrderRepository.save(order);
	}

	@Override
	public Order saveOrder(Order order) {
		// TODO Auto-generated method stub
		return OrderRepository.save(order);
	}

}
