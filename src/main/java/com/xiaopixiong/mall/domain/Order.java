package com.xiaopixiong.mall.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 订单
 * 
 * @author houmaolong
 *
 */
@Entity
public class Order implements Serializable {
	/**
	 * 订单状态
	 */
	public static enum OrderState {
		Closed("订单关闭"),
		ToPaiding("待支付"),
		ToShipped("待发货"),
		ShipmentToConfirmed("已发货待确认"),
		ToEvaluated("待评价"),
		Success("交易成功"); 
		private String name;
		private OrderState(String name) {
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
	@GeneratedValue
	private Long id;
	/**
	 * 用户标识
	 */
	private Long userId;
	/**
	 * 店铺标识
	 */
	private Long shopId;
	/**
	 * 订单号
	 */
	private String orderNum;
	/**
	 * 订单状态
	 */
	private OrderState orderState=OrderState.ToPaiding;
	/**
	 * 支付金额
	 */
	private BigDecimal payment;
	/**
	 * 支付时间
	 */
	private Date paymentTime;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getShopId() {
		return shopId;
	}
	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}
	public String getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}
	public OrderState getOrderState() {
		return orderState;
	}
	public void setOrderState(OrderState orderState) {
		this.orderState = orderState;
	}
	public BigDecimal getPayment() {
		return payment;
	}
	public void setPayment(BigDecimal payment) {
		this.payment = payment;
	}
	public Date getPaymentTime() {
		return paymentTime;
	}
	public void setPaymentTime(Date paymentTime) {
		this.paymentTime = paymentTime;
	}
	
}
