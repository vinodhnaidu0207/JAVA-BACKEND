package com.flm.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Response {

	private EmployeeForm employeeForm;
	private DepartmentForm departmentForm;
}
