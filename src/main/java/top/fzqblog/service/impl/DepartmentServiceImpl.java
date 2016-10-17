package top.fzqblog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import top.fzqblog.mapper.DepartmentMapper;
import top.fzqblog.po.model.Department;
import top.fzqblog.service.IDepartmentService;
import com.baomidou.framework.service.impl.SuperServiceImpl;

/**
 *
 * Department 表数据服务层接口实现类
 *
 */
@Service
public class DepartmentServiceImpl extends SuperServiceImpl<DepartmentMapper, Department> implements IDepartmentService {

	@Autowired
	private DepartmentMapper departmentMapper;
	
	/* (非 Javadoc)
	 * Description:
	 * @see top.fzqblog.service.IDepartmentService#addDepartment(top.fzqblog.po.model.Department)
	 */
	public void addDepartment(Department department) {
		this.departmentMapper.insert(department);
	}

	/* (非 Javadoc)
	 * Description:
	 * @see top.fzqblog.service.IDepartmentService#addSelective(top.fzqblog.po.model.Department)
	 */
	public void addSelective(Department department) {
		this.departmentMapper.insertSelective(department);
	}

	

}