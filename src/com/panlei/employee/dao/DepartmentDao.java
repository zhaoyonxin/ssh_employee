package com.panlei.employee.dao;

import java.util.List;

import com.panlei.employee.domain.Department;

/*
 * ���Ź�����DAO��ӿ�
 */
public interface DepartmentDao {

	int findCount();

	List<Department> findByPage(int begin, int pageSize);

}