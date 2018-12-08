package com.xiaopixiong.mall.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 用户
 * 
 * @author houmaolong
 *
 */
@Entity
public class Address implements Serializable {

	private static final long serialVersionUID = 1L;
	/**
	 * 编号
	 */
	@Id
	@GeneratedValue
	private Long id;
	/**
	 * 用户标识
	 */
	private Long userId;
	/**
	 * 是否默认地址
	 */
	private Boolean isDefault = Boolean.FALSE;
	/**
	 * 所在地
	 */
	private String addres;
	/**
	 * 联系人
	 */
	private String linkName;
	/**
	 * 邮编
	 */
	private String zipCode;
	/**
	 * 状态
	 */
	private Boolean state = Boolean.TRUE;
	/**
	 * 添加时间
	 */
	private Date addDate;
	/**
	 * 修改时间
	 */
	private Date modifyDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

	public String getAddres() {
		return addres;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}

	public String getLinkName() {
		return linkName;
	}

	public void setLinkName(String linkName) {
		this.linkName = linkName;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public Boolean getState() {
		return state;
	}

	public void setState(Boolean state) {
		this.state = state;
	}

	public Date getAddDate() {
		return addDate;
	}

	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}

	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	@Column(nullable = false)
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

}
