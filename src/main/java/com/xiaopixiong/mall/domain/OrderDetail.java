package com.xiaopixiong.mall.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * 订单
 * 
 * @author houmaolong
 *
 */
@Entity
public class OrderDetail implements Serializable {
	

	private static final long serialVersionUID = 1L;
	/**
	 * 编号
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	/**
	 * 订单标识
	 */
	@ManyToOne
	@JoinColumn(name="orderId")
	private Order order;
	/**
	 * 商品标识
	 */
	private Long commodityId;
	/**
	 * 数量
	 */
	private Integer quantity;
	/**
	 * 购买价格
	 */
	private BigDecimal transactionPrice;
	/**
	 * 总价
	 */
	private BigDecimal totalPrice;
	/**
	 * 总积分
	 */
	private Integer integral;
	/**
	 * 评价分
	 */
	private Integer evaluationScore;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Long getCommodityId() {
		return commodityId;
	}
	public void setCommodityId(Long commodityId) {
		this.commodityId = commodityId;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getTransactionPrice() {
		return transactionPrice;
	}
	public void setTransactionPrice(BigDecimal transactionPrice) {
		this.transactionPrice = transactionPrice;
	}
	public BigDecimal getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Integer getIntegral() {
		return integral;
	}
	public void setIntegral(Integer integral) {
		this.integral = integral;
	}
	public Integer getEvaluationScore() {
		return evaluationScore;
	}
	public void setEvaluationScore(Integer evaluationScore) {
		this.evaluationScore = evaluationScore;
	}
	
	
	
}
