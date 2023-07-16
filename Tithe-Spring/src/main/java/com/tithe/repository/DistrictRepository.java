/**
 * 
 */
package com.tithe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tithe.entity.DistrictEntity;

/**
 * @author Ashish Sam T George
 *
 */
@Repository
public interface DistrictRepository extends JpaRepository<DistrictEntity, Long> {

}
