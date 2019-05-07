package com.lanpi.mall.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 用户
 * 
 * @author houmaolong
 *
 */
@Entity
public class User implements Serializable {
	/**
	 * 用户状态
	 */
	public static enum UserState {
		DEFAULT("默认"),
		CANCEL("注销"); 
		private String name;
		private UserState(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
	}

	private static final long serialVersionUID = 1L;
	/**
	 * 编号
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	/**
	 * 手机或邮箱
	 */
	private String account;
	/**
	 * 微信
	 */
	@Column(unique = true, nullable = false)
	private String openid;
	/**
	 * 昵称
	 */
	private String nickName;
	/**
	 * 省份
	 */
	private String provice;
	/**
	 * 城市
	 */
	private String city;
	/**
	 * 头像
	 */
	private String headIcon;
	/**
	 * 注册时间
	 */
	private Date registerDate;
	/**
	 * 注册IP
	 */
	private String registerIp;
	/**
	 * 登录时间
	 */
	private Date loginDate;
	/**
	 * 登录IP
	 */
	private String loginIp;
	/**
	 * 用户状态
	 */
	@Enumerated(EnumType.STRING)
	private UserState userState = UserState.DEFAULT;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getProvice() {
		return provice;
	}

	public void setProvice(String provice) {
		this.provice = provice;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getHeadIcon() {
		return headIcon;
	}

	public void setHeadIcon(String headIcon) {
		this.headIcon = headIcon;
	}

	public Date getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}

	public Date getLoginDate() {
		return loginDate;
	}

	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}

	public String getRegisterIp() {
		return registerIp;
	}

	public void setRegisterIp(String registerIp) {
		this.registerIp = registerIp;
	}

	public String getLoginIp() {
		return loginIp;
	}

	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}

	public UserState getUserState() {
		return userState;
	}

	public void setUserState(UserState userState) {
		this.userState = userState;
	}

}
