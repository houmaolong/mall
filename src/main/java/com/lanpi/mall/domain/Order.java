package com.lanpi.mall.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 订单
 * 
 * @author houmaolong
 *
 */
@Entity
@Table(name = "order_main")
public class Order implements Serializable {
	/**
	 * 订单状态
	 */
	public static enum OrderState {
		Closed("订单关闭"), ToPaiding("待支付"), ToShipped("待发货"), ShipmentToConfirmed("已发货待确认"), ToEvaluated("待评价"), Success(
				"交易成功");
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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	/**
	 * 用户
	 */
	@ManyToOne
	@JoinColumn(name = "userId")
	private User user;
	/**
	 * 店铺
	 */
	@JoinColumn(name = "shopId")
	@ManyToOne
	private Shop shop;
	/**
	 * 订单号
	 */
	private String orderNum;
	/**
	 * 订单状态
	 */
	@Enumerated(EnumType.STRING)
	private OrderState orderState = OrderState.ToPaiding;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
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
