package com.cloud.kj.master.api.service.hystrix;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cloud.kj.master.api.pojo.PojoPages;
import com.cloud.kj.master.api.pojo.User;
import com.cloud.kj.master.api.service.UserClientService;

import feign.hystrix.FallbackFactory;
//将短路器注入到容器中
@Component
public class UserClientServiceFallbackFactory implements
		FallbackFactory<UserClientService> {

	@Override
	public UserClientService create(Throwable cause) {
			return new UserClientService(){
				public User get(Long id){
					User bean = new User();
					bean.setName("服务访问暂时有异常，现在系统已将级做异常处理");
					return bean;
				}
				
				public List<User> list(PojoPages<User> page){
					
					return null;
				}
				
				public Integer add(User user){
					return -1;
				}
			};
	}

}
