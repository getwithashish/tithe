/**
 *
 */
package com.tithe.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Ashish Sam T George
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "city_table")
public class CityEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long cityId;

	@NotBlank(message = "Name of City is empty or null")
	@Column(unique = true)
	private String cityName;

}
