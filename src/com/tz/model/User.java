/**
 * tzdesk系统平台
 * tz_springmvc
 * com.tz.model
 * User.java
 * 创建人:xuchengfei 
 * 时间：2015年10月8日-下午11:43:27 
 * 2015潭州教育公司-版权所有
 */
package com.tz.model;

import javax.persistence.*;
import java.util.Date;

/**
 * 
 * User 创建人:xuchengfei 时间：2015年10月8日-下午11:43:27
 * 
 * @version 1.0.0
 * 
 */
@Entity // 根据 javaBean 生成 表。
@Table(name = "tz_test")
public class User implements java.io.Serializable {

	private static final long serialVersionUID = -4757618119875012803L;
	// 主键
	private Integer id;
	// 用户名称
	private String username;
	// 密码
	private String password;
	//地址
	private String address;
	// 邮箱
	private String email;
	// 年龄
	private Integer age;
	// 创建时间
	private Date createTime;




    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}