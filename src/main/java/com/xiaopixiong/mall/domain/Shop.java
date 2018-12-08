package com.xiaopixiong.mall.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 店铺
 * 
 * @author houmaolong
 *
 */
@Entity
public class Shop implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 编号
	 */
	@Id
	@GeneratedValue
	private Long id;
	/**
	 * 是否启用
	 */
	private Boolean enabled = Boolean.TRUE;
	/**
	 * 门店编号
	 */
	private String number;
	/**
	 * 生鲜配送
	 */
	private String freshDelivery;
	/**
	 * 省份
	 */
	private String provice;
	/**
	 * 城市
	 */
	private String city;
	/**
	 * 地区
	 */
	private String region;
	/**
	 * 店铺名称
	 */
	private String name;
	/**
	 * 店铺地址
	 */
	private String address;
	/**
	 * 联系电话
	 */
	private String contactNumber;
	/**
	 * 店铺介绍
	 */
	private String introduction;
	/**
	 * 店铺特色
	 */
	private String characteristics;
	/**
	 * 地图位置
	 */
	private String mapLocation;
	/**
	 * 排序
	 */
	private Integer sort = 0;
	/**
	 * 图片
	 */
	private String icon;
	/**
	 * 打折优惠信息
	 */
	private String discountInformation;

	/**
	 * 店铺类型
	 */
	public static enum ShopType {
		FRESH("生鲜"), TAKEOUT_FOOD("外卖");
		private String name;

		private ShopType(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	/**
	 * 店铺类型
	 */
	private ShopType shopType = ShopType.FRESH;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ShopType getShopType() {
		return shopType;
	}

	public void setShopType(ShopType shopType) {
		this.shopType = shopType;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getFreshDelivery() {
		return freshDelivery;
	}

	public void setFreshDelivery(String freshDelivery) {
		this.freshDelivery = freshDelivery;
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

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getCharacteristics() {
		return characteristics;
	}

	public void setCharacteristics(String characteristics) {
		this.characteristics = characteristics;
	}

	public String getMapLocation() {
		return mapLocation;
	}

	public void setMapLocation(String mapLocation) {
		this.mapLocation = mapLocation;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getDiscountInformation() {
		return discountInformation;
	}

	public void setDiscountInformation(String discountInformation) {
		this.discountInformation = discountInformation;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

}
