package com.xiaopixiong.mall.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * 物流模板
 * 
 * @author houmaolong
 *
 */
@Entity
public class Shipping implements Serializable {

	private static final long serialVersionUID = 1L;
	/**
	 * 编号
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	/**
	 * 店铺
	 */
	@JoinColumn(name = "shopId")
	@ManyToOne
	private Shop shop;
	/**
	 * 名称
	 */
	private String name;
	/**
	 * 是否包邮
	 */
	private Boolean free = Boolean.TRUE;
	/**
	 * 计价方式
	 */
	@Enumerated(EnumType.STRING)
	private ValuationType valuationType = ValuationType.NUMBER;
	/**
	 * 运送方式
	 */
	@Enumerated(EnumType.STRING)
	private DeliveryType deliveryType;

	public static enum ValuationType {
		NUMBER("按件数"), WEIGHT("按重量");
		private String name;

		private ValuationType(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}

	public static enum DeliveryType {
		EXPRESS("快递"), EMS("EMS"), SURFACE_MAIL("平邮");
		private String name;

		private DeliveryType(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}

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

	public Boolean getFree() {
		return free;
	}

	public void setFree(Boolean free) {
		this.free = free;
	}

	public ValuationType getValuationType() {
		return valuationType;
	}

	public void setValuationType(ValuationType valuationType) {
		this.valuationType = valuationType;
	}

	public DeliveryType getDeliveryType() {
		return deliveryType;
	}

	public void setDeliveryType(DeliveryType deliveryType) {
		this.deliveryType = deliveryType;
	}

	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

}
