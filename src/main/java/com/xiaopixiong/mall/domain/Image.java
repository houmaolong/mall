package com.xiaopixiong.mall.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

/**
 * 竞拍记录
 * 
 * @author houmaolong
 *
 */
@Entity
public class Image implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public enum Type {
		classify, product;
	}

	/**
	 * 编号
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/**
	 * 出价人头像
	 */
	@Lob
	private String fileData;
	/**
	 * 图片所属类型 分类还是产品
	 */
	@Enumerated(EnumType.STRING)
	private Type type;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFileData() {
		return fileData;
	}

	public void setFileData(String fileData) {
		this.fileData = fileData;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	 
}
