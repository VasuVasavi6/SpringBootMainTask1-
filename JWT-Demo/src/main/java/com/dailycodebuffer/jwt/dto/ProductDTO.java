package com.dailycodebuffer.jwt.dto;
//package com.dailycodebuffer.jwt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

//@Getter
//@Setter
@Entity
@Table(name = "ProductDTO")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class ProductDTO {
	@Id
	@Column(name = "ProductID")
	private Long pro_id;
	private String proName;
	private String proDescription;
	private String price;
	private Long categoryId;

	// Constructors, getters, and setters
}
