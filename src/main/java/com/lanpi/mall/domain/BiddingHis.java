package com.lanpi.mall.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 竞拍记录
 * 
 * @author houmaolong
 *
 */
@Entity
public class BiddingHis implements Serializable {
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
	 * 出价时间
	 */
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date biddingTime;
	/**
	 * 出价人openId
	 */
	private String openid;
	/**
	 * 出价人头像
	 */
	private String headIcon;
	/**
	 * 出价昵称
	 */
	private String nickName;
	/**
	 * 出价积分
	 */
	private Integer points;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getBiddingTime() {
		return biddingTime;
	}
	public void setBiddingTime(Date biddingTime) {
		this.biddingTime = biddingTime;
	}
	public String getOpenid() {
		return openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	public String getHeadIcon() {
		return headIcon;
	}
	public void setHeadIcon(String headIcon) {
		this.headIcon = headIcon;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public Integer getPoints() {
		return points;
	}
	public void setPoints(Integer points) {
		this.points = points;
	}
	
}
