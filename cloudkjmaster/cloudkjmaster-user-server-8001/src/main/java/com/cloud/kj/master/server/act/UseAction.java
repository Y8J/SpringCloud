package com.cloud.kj.master.server.act;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cloud.kj.master.api.pojo.PojoPages;
import com.cloud.kj.master.api.pojo.User;
import com.cloud.kj.master.server.service.UserService;

@RequestMapping("user")
@Controller
public class UseAction {


	@Autowired
	private UserService userService;
	
	@ResponseBody
	@RequestMapping(value="/xml.do",method=RequestMethod.GET)
	public String xml(){
		List<User> userXmlBean = userService.UserXmlBean();
		List<Map<Object, Object>> userXmlHash = userService.UserXmlHash();
		
		StringBuffer buffer = new StringBuffer();
		buffer.append(userXmlBean.toString());
		buffer.append(userXmlHash.toString());
		
		return buffer.toString();
		
	}
	
	
	@ResponseBody
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public Integer add(@RequestBody User user){
		Integer a = userService.addUser(user);
		return a;
	}
	
	@ResponseBody
	@RequestMapping(value="/get/{id}",method=RequestMethod.GET)
	public User get(@PathVariable("id") Long id){
	   User user =	userService.queryUserById(id);
	   return user;
	}
	
	@ResponseBody
	@RequestMapping(value="/list",method=RequestMethod.POST)
	public List<User> list(@RequestBody PojoPages<User> page){
		List<User> userList = userService.pagehelperUserList(page.getBean(),  page.getPage(), page.getLimit());
		return userList;
	}
	/**
	 * application/json 请求头传递
	 * @param page
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/pagelist",method=RequestMethod.POST)
	public List<User> listPage(@RequestBody PojoPages<User> page){
		List<User> userList = userService.pagehelperUserList(page.getBean(), page.getPage(), page.getLimit());
		return userList;
	}
	
	/**
	 * application/json 请求头传递
	 * @param page
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/putAdd",method=RequestMethod.PUT)
	public void listPut(@RequestBody PojoPages<User> page){
		Integer addUser = userService.addUser(page.getBean());
	}
	
	/**
	 * application/json 请求头传递
	 * @param page
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/deleteid/{id}",method=RequestMethod.DELETE)
	public void listDelete(@PathVariable("id") Long id){
		User user = userService.queryUserById(id);
		System.out.println(user.toString());
	}
}
