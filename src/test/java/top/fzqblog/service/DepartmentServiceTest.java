/******************************************************************
 *
 *    
 *
 *    Copyright (c) 2016-forever 
 *    http://www.fzqblog.top
 *
 *    Package:     top.fzqblog.service
 *
 *    Filename:    DepartmentServiceTest.java
 *
 *    Description: TODO(用一句话描述该文件做什么)
 *
 *    Copyright:   Copyright (c) 2001-2014
 *
 *    Company:     fzqblog
 *
 *    @author:     抽离
 *
 *    @version:    1.0.0
 *
 *    Create at:   2016年10月17日 下午3:19:03
 *
 *    Revision:
 *
 *    2016年10月17日 下午3:19:03
 *        - first revision
 *
 *****************************************************************/
package top.fzqblog.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import top.fzqblog.mapper.DepartmentMapper;
import top.fzqblog.po.model.Department;

/**
 * @ClassName DepartmentServiceTest
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author 抽离
 * @Date 2016年10月17日 下午3:19:03
 * @version 1.0.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:springmvc-servlet.xml",
		"classpath:spring-config.xml"
})
public class DepartmentServiceTest {
	

	
	@Autowired
	private IDepartmentService iDepartmentService;
	
	@Autowired
	private DepartmentMapper departmentMapper;
	
	@Test
	public void testAddDepartment(){
		Department department = new Department();
		department.setName("lalall");
		department.setDescription("adsfaddf");
		this.iDepartmentService.addDepartment(department);
	}
	
	@Test
	public void testAddDepartmentSelective(){
		Department department = new Department();
		department.setId(1L);
		department.setDescription("吃个蛋");
		this.iDepartmentService.addSelective(department);
	}
	
	@Test
	public void testUpdate(){
		Department department = new Department();
		department.setId(1L);
		department.setDescription("吃个蛋");
		this.departmentMapper.updateById(department);
	}
	
}
