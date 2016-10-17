package top.fzqblog.service;



import top.fzqblog.po.model.Department;



import com.baomidou.framework.service.ISuperService;

/**
 *
 * Department 表数据服务层接口
 *
 */
public interface IDepartmentService extends ISuperService<Department> {

	public void addDepartment(Department department);

	public void addSelective(Department department);
}