package com.flm.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.flm.entity.Department;
import com.flm.exception.DepartmentNotFoundException;
import com.flm.repository.DepartmentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DepartmentService {

	private final DepartmentRepository departmentRepository;
	
	public Department saveDepartment(Department department) {
		return departmentRepository.save(department);
	}
	
	public Department getDepartment(Long id) throws DepartmentNotFoundException {
		Optional<Department> optdept = departmentRepository.findById(id);
		if(optdept.isPresent()) return optdept.get();
		throw new DepartmentNotFoundException("Department Is Not Found.....");
	}
}
