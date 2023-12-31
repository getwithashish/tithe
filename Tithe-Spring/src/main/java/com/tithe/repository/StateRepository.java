/**
 *
 */
package com.tithe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tithe.entity.StateEntity;

/**
 * @author Ashish Sam T George
 *
 */
@Repository
public interface StateRepository extends JpaRepository<StateEntity, Long> {
	
	List<StateEntity> findByStateNameContainingIgnoringCase(String stateName);

}
