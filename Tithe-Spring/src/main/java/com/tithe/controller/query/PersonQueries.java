/**
 *
 */
package com.tithe.controller.query;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.tithe.entity.EducationEntity;
import com.tithe.entity.OccupationEntity;
import com.tithe.entity.PersonEntity;
import com.tithe.entity.RelationEntity;
import com.tithe.model.PersonQueryFilter;
import com.tithe.service.query.EducationQueryService;
import com.tithe.service.query.OccupationQueryService;
import com.tithe.service.query.PersonQueryService;
import com.tithe.service.query.RelationQueryService;

/**
 * @author Ashish Sam T George
 *
 */
@Controller
public class PersonQueries {

	@Autowired
	private PersonQueryService personQueryService;

	@Autowired
	private EducationQueryService educationQueryService;

	@Autowired
	private OccupationQueryService occupationQueryService;

	@Autowired
	private RelationQueryService relationQueryService;

	@QueryMapping(name = "getOnePerson")
	public PersonEntity getOnePerson(@Argument Long id) {
		return personQueryService.getOnePerson(id);
	}

	@QueryMapping(name = "getManyPersons")
	public List<PersonEntity> getManyPersons(@Argument(name = "filter") PersonQueryFilter personQueryFilter){
		return personQueryService.getManyPersons(personQueryFilter);
	}

	@QueryMapping(name = "getAllPersons")
	public List<PersonEntity> getAllPersons(){
		return personQueryService.getAllPersons();
	}
	
	@QueryMapping(name = "getAllPersonsByForane")
	public List<PersonEntity> getAllPersonsByForane(@Argument(name = "foraneId") Long foraneId){
		return personQueryService.getAllPersonsByForane(foraneId);
	}
	
	@QueryMapping(name = "getAllPersonsByParish")
	public List<PersonEntity> getAllPersonsByParish(@Argument(name = "parishId") Long parishId){
		return personQueryService.getAllPersonsByParish(parishId);
	}
	
	@QueryMapping(name = "getAllPersonsByKoottayma")
	public List<PersonEntity> getAllPersonsByKoottayma(@Argument(name = "koottaymaId") Long koottaymaId){
		return personQueryService.getAllPersonsByKoottayma(koottaymaId);
	}
	
	@QueryMapping(name = "getAllPersonsByFamily")
	public List<PersonEntity> getAllPersonsByFamily(@Argument(name = "familyId") Long familyId){
		return personQueryService.getAllPersonsByFamily(familyId);
	}

	@QueryMapping(name = "getPersonCount")
	public Long getPersonCount() {
		return personQueryService.getPersonCount();
	}
	
	@QueryMapping(name = "getPersonCountByForane")
	public Long getPersonCountByForane(@Argument(name = "foraneId") Long foraneId) {
		return personQueryService.getPersonCountByForane(foraneId);
	}
	
	@QueryMapping(name = "getPersonCountByParish")
	public Long getPersonCountByParish(@Argument(name = "parishId") Long parishId) {
		return personQueryService.getPersonCountByParish(parishId);
	}
	
	@QueryMapping(name = "getPersonCountByKoottayma")
	public Long getPersonCountByKoottayma(@Argument(name = "koottaymaId") Long koottaymaId) {
		return personQueryService.getPersonCountByKoottayma(koottaymaId);
	}
	
	@QueryMapping(name = "getPersonCountByFamily")
	public Long getPersonCountByFamily(@Argument(name = "familyId") Long familyId) {
		return personQueryService.getPersonCountByFamily(familyId);
	}

	@QueryMapping(name = "getOneEducation")
	public EducationEntity getOneEducation(@Argument Long id) {
		return educationQueryService.getOneEducation(id);
	}

	@QueryMapping(name = "getAllEducations")
	public List<EducationEntity> getAllEducations(){
		return educationQueryService.getAllEducations();
	}

	@QueryMapping(name = "getOneOccupation")
	public OccupationEntity getOneOccupation(@Argument Long id) {
		return occupationQueryService.getOneOccupation(id);
	}

	@QueryMapping(name = "getAllOccupations")
	public List<OccupationEntity> getAllOccupations(){
		return occupationQueryService.getAllOccupations();
	}

	@QueryMapping(name = "getOneRelation")
	public RelationEntity getOneRelation(@Argument Long id) {
		return relationQueryService.getOneRelation(id);
	}

	@QueryMapping(name = "getAllRelations")
	public List<RelationEntity> getAllRelations(){
		return relationQueryService.getAllRelations();
	}

}
