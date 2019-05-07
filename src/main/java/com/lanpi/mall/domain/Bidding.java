package com.lanpi.mall.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 竞拍
 * 
 * @author houmaolong
 *
 */
@Entity
public class Bidding implements Serializable {

	public Bidding() {

	}

	public static enum BiddingType {
		ADD("增价型");
		private String name;

		private BiddingType(String name) {
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
	 * 主标题
	 */
	private String title;
	/**
	 * 副标题
	 */
	private String subTitle;
	/**
	 * 竞价类型
	 */
	@Enumerated(EnumType.STRING)
	private BiddingType biddingType = BiddingType.ADD;
	/**
	 * 起始积分
	 */
	private Integer beginPoints = 3;
	/**
	 * 竞拍积分幅度
	 */
	private Integer stepPoints;
	/**
	 * 当前积分
	 */
	private Integer currentPoints;
	/**
	 * 开始时间
	 */
	@JsonFormat(pattern = "MM月dd日 HH:mm:ss")
	private Date startTime;
	/**
	 * 结束时间
	 */
	@JsonFormat(pattern = "MM月dd日 HH:mm:ss")
	private Date endTime;
	/**
	 * 围观次数
	 */
	private Integer onlookers;
	/**
	 * 延时周期 分钟
	 */
	private Integer delayPeriod = 3;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "biddingId")
	@OrderBy("points DESC")
	private List<BiddingHis> biddingHis;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public Integer getBeginPoints() {
		return beginPoints;
	}

	public void setBeginPoints(Integer beginPoints) {
		this.beginPoints = beginPoints;
	}

	public Integer getStepPoints() {
		return stepPoints;
	}

	public void setStepPoints(Integer stepPoints) {
		this.stepPoints = stepPoints;
	}

	public Integer getCurrentPoints() {
		return currentPoints;
	}

	public void setCurrentPoints(Integer currentPoints) {
		this.currentPoints = currentPoints;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Integer getOnlookers() {
		return onlookers;
	}

	public void setOnlookers(Integer onlookers) {
		this.onlookers = onlookers;
	}

	public Integer getDelayPeriod() {
		return delayPeriod;
	}

	public void setDelayPeriod(Integer delayPeriod) {
		this.delayPeriod = delayPeriod;
	}

	public BiddingType getBiddingType() {
		return biddingType;
	}

	public String getBiddingTypeName() {
		return biddingType.name;
	}

	public void setBiddingType(BiddingType biddingType) {
		this.biddingType = biddingType;
	}

	@Transient
	public Integer getStatus() {
		Date current = new Date();
		if (current.compareTo(startTime) == -1) {
			return -1;
		}
		if (current.compareTo(startTime) == 1 && current.compareTo(endTime) == -1) {
			return 0;
		}
		return 1;
	}

	@Transient
	public String getRemainingTime() {

		long date = endTime.getTime() - new Date().getTime();
		long day = date / (1000 * 60 * 60 * 24);
		long hour = (date / (1000 * 60 * 60) - day * 24);
		long min = ((date / (60 * 1000)) - day * 24 * 60 - hour * 60);
		long s = (date / 1000 - day * 24 * 60 * 60 - hour * 60 * 60 - min * 60);
		if (day > 0) {
			return "" + day + "天" + hour + "小时" + min + "分" + s + "秒";
		} else if (day == 0 && hour > 0) {
			return "" + hour + "小时" + min + "分" + s + "秒";
		} else {
			return min + "分" + s + "秒";
		}
	}

	public List<BiddingHis> getBiddingHis() {
		return biddingHis;
	}

	public void setBiddingHis(List<BiddingHis> biddingHis) {
		this.biddingHis = biddingHis;
	}

}
