package com.ecommerce.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ecommerce.model.Department;

public interface DepartmentRepository extends CrudRepository<Department, Long> {
  
  List<Department> findByNiddepartment(int id);
   
  List<Department> findBySdepartment(String sdepartment);
  
  List<Department> findByBisactive(boolean bisactive);
  
}
