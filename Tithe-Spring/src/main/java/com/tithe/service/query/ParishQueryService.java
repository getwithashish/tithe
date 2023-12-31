/**
 *
 */
package com.tithe.service.query;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.tithe.entity.ForaneEntity;
import com.tithe.entity.ParishEntity;
import com.tithe.model.ParishQueryFilter;
import com.tithe.repository.ParishRepository;

/**
 * @author Ashish Sam T George
 *
 */
@Service
public class ParishQueryService {

	@Autowired
	private ParishRepository parishRepository;

	@Autowired
	private ForaneQueryService foraneQueryService;

	public ParishEntity getOneParish(Long id) {
		Optional<ParishEntity> parish = parishRepository.findById(id);
		return parish.orElse(null);
	}

	public List<ParishEntity> getManyParishes(ParishQueryFilter parishQueryFilter) {
		ParishEntity parish = new ParishEntity();
		if (parishQueryFilter.getParishName()!=null && !parishQueryFilter.getParishName().isBlank()) {
			parish.setParishName(parishQueryFilter.getParishName());
		}
		parish.setPhone(parishQueryFilter.getPhone());
		if (parishQueryFilter.getForaneId()!=null) {
			parish.setForane(foraneQueryService.getOneForane(parishQueryFilter.getForaneId()));
		}

		parish.setActive(parishQueryFilter.getActive());

		Example<ParishEntity> exampleParish = Example.of(parish);
		List<ParishEntity> matchingParishes = parishRepository.findAll(exampleParish);

		if (matchingParishes.size()!=0) {
			return matchingParishes;
		}
		return null;
	}

	public List<ParishEntity> getAllParishes() {
		List<ParishEntity> parishes = parishRepository.findAll();
		if (parishes.size()!=0) {
			return parishes;
		}
		return null;
	}
	
	public List<ParishEntity> getAllParishesByForane(Long foraneId) {
		ForaneEntity forane = foraneQueryService.getOneForane(foraneId);
		if (forane!=null) {
			List<ParishEntity> parishes = parishRepository.findAllByForane(forane);
			if (parishes.size()!=0) {
				return parishes;
			}
		}
		return null;
	}

	public Long getParishCount() {
		return parishRepository.countByActive(true);
	}

	public Long getParishCountByForane(Long foraneId) {
		ForaneEntity forane = foraneQueryService.getOneForane(foraneId);
		if (forane!=null) {
			return parishRepository.countByForaneAndActive(forane, true);
		}
		return null;
	}

}
