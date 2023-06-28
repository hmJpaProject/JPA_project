package com.green.university.repository.interfaces;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.green.university.dto.DepartmentFormDto;

/*
 *  박성희
 *  학과 repository
 */

@Mapper
public interface DepartmentRepository {
	public int insert(DepartmentFormDto departmentFormDto);
	
	public Department selectById(Integer id);
	public List<Department> selectByDepartmentDto();
	public int deleteById(Integer id);
	public int updateByDepartmentDto(DepartmentFormDto departmentFormDto);
	
}
