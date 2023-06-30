/**
 * 
 */
package com.tithe.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public class OccupationEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long OccupationId;
	
	private String OccupationName;

}
