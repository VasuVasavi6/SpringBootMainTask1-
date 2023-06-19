package com.dailycodebuffer.jwt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
//@Getter
//@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Product {
	@Id
	@Column(name = "ProductID")
	private Long pro_id;
	@Column(name = "ProName")
	private String ProName;
	@Column(name = "ProDescription")
	private String ProDescription;
	@Column(name = "PRICE")
	private String price;

	@ManyToOne
	@JoinColumn(name = "CategoryID")

	private Category category;

}
