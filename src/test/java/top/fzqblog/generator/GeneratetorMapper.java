/******************************************************************
 *
 *    
 *
 *    Copyright (c) 2016-forever 
 *    http://www.fzqblog.top
 *
 *    Package:     top.fzqblog.generator
 *
 *    Filename:    GeneratetorMapper.java
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
 *    Create at:   2016年10月17日 下午2:23:55
 *
 *    Revision:
 *
 *    2016年10月17日 下午2:23:55
 *        - first revision
 *
 *****************************************************************/
package top.fzqblog.generator;

import java.io.IOException;
import java.util.Properties;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import com.baomidou.mybatisplus.annotations.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.ConfigGenerator;

/**
 * @ClassName GeneratetorMapper
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author 抽离
 * @Date 2016年10月17日 下午2:23:55
 * @version 1.0.0
 */
public class GeneratetorMapper {
	
    /* 生成代码包名 */
    private static final String PACKAGE_NAME = "top.fzqblog";
	
	public static void main(String[] args) {
		/* 获取 JDBC 配置文件 */
        Properties props = getProperties();

        /* 配置 Mybatis-Plus 代码生成器 */
        ConfigGenerator cg = new ConfigGenerator();

        /* Mysql 数据库相关配置 */
        cg.setDbDriverName("com.mysql.jdbc.Driver");
        cg.setDbUrl(props.getProperty("db.master.url"));
        cg.setDbUser(props.getProperty("db.master.user"));
        cg.setDbPassword(props.getProperty("db.master.password"));

        /* 设置数据库前缀（例如`mp_user`生成实体类，false 为 MpUser.java , true 为 User.java）*/
        cg.setDbPrefix(false);

         /*
         * true 表示数据库设置全局下划线命名规则，默认 false
         * ------------------------------------------------------------------------------------
         * 【 开启该设置实体可无 @TableId(value = "test_id") 字段映射，启动配置对应也要开启 true 设置 】
         */
        cg.setDbColumnUnderline(false);

        /*
         * 表主键 ID 生成类型, 自增该设置无效。
         * <p>
         * IdType.AUTO             数据库ID自增
         * IdType.INPUT            用户输入ID
         * IdType.ID_WORKER        全局唯一ID，内容为空自动填充（默认配置）
         * IdType.UUID            全局唯一ID，内容为空自动填充
         * </p>
         */
        cg.setIdType(IdType.AUTO);

        /* 生成文件保存位置 */
        cg.setSaveDir("C:/");

        /* 生成代码包路径 */
        cg.setEntityPackage(PACKAGE_NAME + ".po.model"); //entity 实体包路径
        cg.setMapperPackage(PACKAGE_NAME + ".mapper"); //mapper 映射文件路径
        cg.setServicePackage(PACKAGE_NAME + ".service"); //service 层路径
        cg.setXmlPackage(PACKAGE_NAME + ".mapper"); //xml层路径
        
        /* 生成代码 */
        AutoGenerator.run(cg);
	}
	
	public static Properties getProperties(){
		// 读取配置文件
        Resource resource = new ClassPathResource("/config/db.properties");
        Properties props = new Properties();
        try {
            props = PropertiesLoaderUtils.loadProperties(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return props;
	}
}
