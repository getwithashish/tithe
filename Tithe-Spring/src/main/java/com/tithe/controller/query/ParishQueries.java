/**
 *
 */
package com.tithe.controller.query;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.tithe.entity.ParishEntity;
import com.tithe.model.ParishQueryFilter;
import com.tithe.service.query.ParishQueryService;

/**
 * @author Ashish Sam T George
 *
 */
@Controller
public class ParishQueries {

	@Autowired
	private ParishQueryService parishQueryService;

	@QueryMapping(name = "getOneParish")
	public ParishEntity getOneParish(@Argument Long id) {
		return parishQueryService.getOneParish(id);
	}

	@QueryMapping(name = "getManyParishes")
	public List<ParishEntity> getManyParishes(@Argument(name = "filter") ParishQueryFilter parishQueryFilter) {
		return parishQueryService.getManyParishes(parishQueryFilter);
	}

	@QueryMapping(name = "getAllParishes")
	public List<ParishEntity> getAllParishes() {
		return parishQueryService.getAllParishes();
	}
	
	@QueryMapping(name = "getAllParishesByForane")
	public List<ParishEntity> getAllParishesByForane(@Argument(name = "foraneId") Long foraneId) {
		return parishQueryService.getAllParishesByForane(foraneId);
	}

	@QueryMapping(name = "getParishCount")
	public Long getParishCount() {
		return parishQueryService.getParishCount();
	}
	
	@QueryMapping(name = "getParishCountByForane")
	public Long getParishCountByForane(@Argument(name = "foraneId") Long foraneId) {
		return parishQueryService.getParishCountByForane(foraneId);
	}

}
