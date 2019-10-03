package com.TechTalentSouth.TechTalentBlog1.repository;

import org.springframework.data.repository.CrudRepository;
import com.TechTalentSouth.TechTalentBlog1.domain.*;
import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer,Long> {
	
	List<Customer> findByLastName(String LastName);

}
