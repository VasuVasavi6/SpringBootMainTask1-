package com.dailycodebuffer.jwt.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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
public class Category {
	@Id
	@Column(name = "CategoryID")
	private Long id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "DESCRIPTION")
	private String description;
	@Column(name = "TAXPERCENT")
	private Double taxPercent;

	@OneToMany(mappedBy = "category")
	@JsonIgnore
	private Set<Product> product;

}
