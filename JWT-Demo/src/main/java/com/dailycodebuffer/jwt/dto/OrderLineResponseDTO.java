package com.dailycodebuffer.jwt.dto;

import java.time.LocalDateTime;
import java.util.List;

import com.dailycodebuffer.jwt.entity.OrderLine;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class OrderLineResponseDTO {

	private Long orderId;
	private LocalDateTime date;
	private String custName;
	private List<OrderLine> orderline;
	private int totalprice;
	private int totaltax;
	private int grosstotal;

	// Add getters and setters
	/*
	 * private String name; private Double quantity; private Double amount; private
	 * Double tax; private Long pro_id;
	 */
}
