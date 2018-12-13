package com.xiaopixiong.mall.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 商品
 * 
 * @author houmaolong
 *
 */
@Entity
public class Commodity implements Serializable {
	/**
	 * 
	 */
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
	private Long shopId;
	/**
	 * 分类
	 */
	private Long classId;
	/**
	 * 条码编号
	 */
	private String barCode;
	/**
	 * 视频编号
	 */
	private String video;
	/**
	 * 商品名称
	 */
	private String name;
	/**
	 * 商品特色
	 */
	private String characteristics;
	/**
	 * 物流模板
	 */
	private Long shippingId;
	/**
	 * 排序
	 */
	private Integer sort = 0;
	/**
	 * 是否推荐
	 */
	private Boolean recommend = Boolean.FALSE;
	/**
	 * 是否上架
	 */
	private Boolean state = Boolean.TRUE;
	/**
	 * 商品图片
	 */
	private String icon;
	/**
	 * 详细介绍
	 */
	private String introduction;
	/**
	 * 原价
	 */
	private BigDecimal originalPrice=new BigDecimal(0);
	/**
	 * 现价
	 */
	private BigDecimal presentPrice=new BigDecimal(0);
	/**
	 * 拼团价
	 */
	private BigDecimal groupPrice=new BigDecimal(0);
	/**
	 * 需要积分
	 */
	private Integer integral=0;
	/**
	 * 库存数
	 */
	private Integer stockNumber=0;
	/**
	 * 商品重量
	 */
	private Integer weight=0;
	/**
	 * 分享奖励类型
	 */
	@Enumerated(EnumType.STRING)
	private SharingType sharingType =SharingType.Closed;
	/**
	 * 分享奖励
	 */
	private Integer rewards=0;
	/**
	 * 拼团功能
	 */
	private Boolean groupable=Boolean.FALSE;
	/**
	 * 起售时间
	 */
	private Date sellingTime;
	/**
	 * 停售时间
	 */
	private Date stoppingTime;
	
	public static enum SharingType {
		Closed("关闭"),
		Integral("送积分"),
		Cash("送现金"); 
		private String name;
		private SharingType(String name) {
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

	public Long getShopId() {
		return shopId;
	}

	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}

	public Long getClassId() {
		return classId;
	}

	public void setClassId(Long classId) {
		this.classId = classId;
	}

	public String getBarCode() {
		return barCode;
	}

	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCharacteristics() {
		return characteristics;
	}

	public void setCharacteristics(String characteristics) {
		this.characteristics = characteristics;
	}

	public Long getShippingId() {
		return shippingId;
	}

	public void setShippingId(Long shippingId) {
		this.shippingId = shippingId;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public Boolean getRecommend() {
		return recommend;
	}

	public void setRecommend(Boolean recommend) {
		this.recommend = recommend;
	}

	public Boolean getState() {
		return state;
	}

	public void setState(Boolean state) {
		this.state = state;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public BigDecimal getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(BigDecimal originalPrice) {
		this.originalPrice = originalPrice;
	}

	public BigDecimal getPresentPrice() {
		return presentPrice;
	}

	public void setPresentPrice(BigDecimal presentPrice) {
		this.presentPrice = presentPrice;
	}

	public BigDecimal getGroupPrice() {
		return groupPrice;
	}

	public void setGroupPrice(BigDecimal groupPrice) {
		this.groupPrice = groupPrice;
	}

	public Integer getIntegral() {
		return integral;
	}

	public void setIntegral(Integer integral) {
		this.integral = integral;
	}

	public Integer getStockNumber() {
		return stockNumber;
	}

	public void setStockNumber(Integer stockNumber) {
		this.stockNumber = stockNumber;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public SharingType getSharingType() {
		return sharingType;
	}

	public void setSharingType(SharingType sharingType) {
		this.sharingType = sharingType;
	}

	public Integer getRewards() {
		return rewards;
	}

	public void setRewards(Integer rewards) {
		this.rewards = rewards;
	}

	public Boolean getGroupable() {
		return groupable;
	}

	public void setGroupable(Boolean groupable) {
		this.groupable = groupable;
	}

	public Date getSellingTime() {
		return sellingTime;
	}

	public void setSellingTime(Date sellingTime) {
		this.sellingTime = sellingTime;
	}

	public Date getStoppingTime() {
		return stoppingTime;
	}

	public void setStoppingTime(Date stoppingTime) {
		this.stoppingTime = stoppingTime;
	}
	
}
