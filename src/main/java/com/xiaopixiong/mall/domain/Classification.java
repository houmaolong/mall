package com.xiaopixiong.mall.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 商品分类
 * 
 * @author houmaolong
 *
 */
@Entity
public class Classification implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * 编号
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	/**
	 * 名称
	 */
	private String name;
	/**
	 * 类型
	 */
	private String classificationType;
	/**
	 * 上级分类
	 */
	private Long parentId;
	/**
	 * 编号
	 */
	private String classificationNumber;
	/**
	 * 图标
	 */
	private String icon;
	/**
	 * 是否启用
	 */
	private Boolean enabled=Boolean.TRUE;
	/**
	 * 排序
	 */
	private Integer sort=0;
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
	public String getClassificationType() {
		return classificationType;
	}
	public void setClassificationType(String classificationType) {
		this.classificationType = classificationType;
	}
	public Long getParentId() {
		return parentId;
	}
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	public String getClassificationNumber() {
		return classificationNumber;
	}
	public void setClassificationNumber(String classificationNumber) {
		this.classificationNumber = classificationNumber;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public Boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
	public Integer getSort() {
		return sort;
	}
	public void setSort(Integer sort) {
		this.sort = sort;
	}
}
