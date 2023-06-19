package com.dailycodebuffer.jwt.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Table(name = "orderline")

@Embeddable
public class OrderLine {
	@Id
//	@Column(name = "OrderLineID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long orderLineId;
	@Column(name = "NAME")
	private String name;
	@Column(name = "QUANTITY")
	private Double quantity;
	@Column(name = "AMOUNT")
	private Double amount;
	@Column(name = "TAX")
	private Double tax;
	// @JoinColumn(name = "ProductID")
	// @JoinColumn(name = "ProductID")
	private Long pro_id;
	@ManyToOne
	@JoinColumn(name = "order_id")
	@JsonIgnore
	private Order order;

}
