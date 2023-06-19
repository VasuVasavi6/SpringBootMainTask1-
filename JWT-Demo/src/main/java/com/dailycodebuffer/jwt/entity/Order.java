package com.dailycodebuffer.jwt.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

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
@Table(name = "Orders")

public class Order {
	@Id
	// @Column(name = "ORDERID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long orderId;
	@Column(name = "CUST_NAME")
	private String custName;
	@Column(name = "DATE")
	private LocalDateTime date;
	// @JoinColumn(name = "OrderLineID")
//	@ElementCollection
//	@Column(name = "ITEMS")
//	@ElementCollection(targetClass = OrderLine.class, fetch = FetchType.EAGER)
//	private List<OrderLine> Items = new ArrayList<OrderLine>();
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "order")
	private List<OrderLine> orderLines;
	// private OrderLine orderLine;
	@Column(name = "TOTALPRICE")
	private Double totalprice;
	@Column(name = "TOTALTAX")
	private Double totaltax;
	@Column(name = "GROSSTOTAL")
	private Double grosstotal;

}
