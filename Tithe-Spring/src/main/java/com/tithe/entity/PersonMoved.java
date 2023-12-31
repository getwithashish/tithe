/**
 *
 */
package com.tithe.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
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
@Table(name = "person_moved_table")
public class PersonMoved {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long personMovedId;

	@OneToOne
	@JoinColumn(name = "person_id")
	private PersonEntity person;

	@OneToOne
	@JoinColumn(name = "old_family_id")
	private FamilyEntity oldFamily;

	@OneToOne
	@JoinColumn(name = "new_family_id")
	private FamilyEntity newFamily;

	private Date timeStamp;

}
