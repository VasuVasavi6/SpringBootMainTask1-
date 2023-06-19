package com.dailycodebuffer.jwt.dto;

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

public class OrderRequestDTO {

	private String custname;
	private List<OrderLine> orderline;

	// Add getters and setters
}
