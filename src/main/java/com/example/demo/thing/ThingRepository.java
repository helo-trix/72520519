package com.example.demo.thing;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThingRepository extends PagingAndSortingRepository<Thing, String> {
	@Query("select t from Thing t")
	List<Thing> getThings();
}