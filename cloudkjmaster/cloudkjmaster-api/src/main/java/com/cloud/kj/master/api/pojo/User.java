package com.cloud.kj.master.api.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import lombok.extern.log4j.Log4j;

/*//org.projectlombok 坐标提供
@Data //注解在类上；提供类所有属性的 getting 和 setting 方法，此外还提供了equals、canEqual
//@Sette //注解在属性上；为属性提供 setting 方法
//@Gette //注解在属性上；为属性提供 getting 方法
@Log4j //注解在类上；为类提供一个 属性名为log 的 log4j 日志对象
@NoArgsConstructor //注解在类上；为类提供一个无参的构造方法
@AllArgsConstructor //注解在类上；为类提供一个全参的构造方法
@Accessors(chain=true) //可以使用链式写法
*/
@Table(name = "t_user")
public class User implements Serializable {

	@Id
	@Column(name="id") //mapper才使用  
	@GeneratedValue(strategy=GenerationType.IDENTITY) //主键
	private Long id; //用户ID

    private String name; //用户名称
	
	private String password;  //用户密码

    private Integer status;  //用户状态

    private String email; //用户邮箱

    private String mobile; //用户手机号码
    
    //private String db_source; // 来自那个数据库，因为微服务可以一个服务对应一个数据库，同一个信息被存储到不同的数据库

    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	/*public String getDb_source() {
		return db_source;
	}

	public void setDb_source(String db_source) {
		this.db_source = db_source;
	}*/

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password
				+ ", status=" + status + ", email=" + email + ", mobile="
				+ mobile + "]";
	}
}
