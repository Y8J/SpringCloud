package com.cloud.kj.master.server.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.cloud.kj.master.api.pojo.User;

@Mapper     //声明是一个Mapper,与springbootApplication中的@MapperScan二选一写上即可
@Repository
public interface UserMapperXml {

	public List<Map<Object,Object>> queryTestMap();
	
	public List<User> queryTestPojo();
	
}
