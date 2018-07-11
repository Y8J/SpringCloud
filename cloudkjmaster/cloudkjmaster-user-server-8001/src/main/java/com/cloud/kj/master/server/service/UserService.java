package com.cloud.kj.master.server.service;

import java.util.List;
import java.util.Map;

import com.cloud.kj.master.api.pojo.User;
import com.github.pagehelper.PageInfo;

public interface UserService {

	/**
	 * 添加用户
	 * @param user
	 */
	public Integer addUser(User user);
	
	/**
	 * 根据用户ID查询用户信息
	 * @param id
	 * @return
	 */
	public User queryUserById(Long id);
	
	/**
	 * 分页查询用户列表
	 */
	public List<User> pagehelperUserList(User user,Integer pageNo,Integer pageSize);
	
	/**
	 * MyBatis 本身XML配置文件查询数据库数据
	 * @return
	 */
	public List<Map<Object,Object>>  UserXmlHash();
	
	/**
	 * MyBatis 本身XML配置文件查询数据库数据 关联User,bean
	 * @return
	 */
	public List<User>  UserXmlBean();

	/**
	 * 分页数据携带显示
	 * @param user
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	public PageInfo<User> findAll(User user, Integer pageNo, Integer pageSize);
	
	
}
