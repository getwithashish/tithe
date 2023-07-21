/**
 * 
 */
package com.tithe.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author Ashish Sam T George
 *
 */
@NoArgsConstructor
@Data
public class AddressQueryFilter {
	
	String buildingName;
	Long streetId;
	Long cityId;
	Long districtId;
	Long stateId;
	Long pincodeId;

}
