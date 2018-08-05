package com.hosiang.dev.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * Blog：http://www.hosiang.cn
 * 用户信息表
 * @author Howe Hsiang
 *
 */
@Entity
@Table(name = "sys_user")
public class UserBean {

	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@Column(name = "id", length = 50)
	public String id;

	//用户编码
	@Column(name = "user_code", length = 50)
	public String userCode;

	//用户头像
	@Column(name = "user_headimg", length = 50)
	public String userHeadimg;

	//用户昵称
	@Column(name = "user_nickname", length = 50)
	public String userNickname;

	//用户名称
	@Column(name = "user_name", length = 50)
	public String userName;

	//用户密码
	@Column(name = "user_password", length = 50)
	public String userPassword;

	//用户性别
	@Column(name = "user_sex")
	public Integer userSex;

	//创建时间
	@Temporal(TemporalType.DATE)
	@Column(name = "create_time")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	public Date createTime;

	//修改时间
	@Temporal(TemporalType.DATE)
	@Column(name = "update_time")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	public Date updateTime;

	//作废标识
	@Column(name = "yn")
	public Integer yn;

	/**
	 * 省略 get set
	 */
}
