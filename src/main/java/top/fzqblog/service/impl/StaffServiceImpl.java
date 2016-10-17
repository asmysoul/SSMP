package top.fzqblog.service.impl;

import org.springframework.stereotype.Service;

import top.fzqblog.mapper.StaffMapper;
import top.fzqblog.po.model.Staff;
import top.fzqblog.service.IStaffService;
import com.baomidou.framework.service.impl.SuperServiceImpl;

/**
 *
 * Staff 表数据服务层接口实现类
 *
 */
@Service
public class StaffServiceImpl extends SuperServiceImpl<StaffMapper, Staff> implements IStaffService {


}