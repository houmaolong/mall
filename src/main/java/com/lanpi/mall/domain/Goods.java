package com.lanpi.mall.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * 商品
 * 
 * @author houmaolong
 *
 */
@Entity
public class Goods implements Serializable {

	public Goods() {

	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 编号
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	/**
	 * 名称
	 */
	private String name;
	/**
	 * 主图
	 */
	private String thumbnail;
	/**
	 * 会员价
	 */
	private BigDecimal vipPrice;
	
	/**
	 * 原价
	 */
	private BigDecimal price;
	/**
	 * 收益
	 */
	private BigDecimal profit;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "classifyId")
	private Classify classify;

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

	public BigDecimal getVipPrice() {
		return vipPrice;
	}

	public void setVipPrice(BigDecimal vipPrice) {
		this.vipPrice = vipPrice;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getProfit() {
		return profit;
	}

	public void setProfit(BigDecimal profit) {
		this.profit = profit;
	}

	public Classify getClassify() {
		return classify;
	}

	public void setClassify(Classify classify) {
		this.classify = classify;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

}
