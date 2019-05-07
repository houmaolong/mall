package com.lanpi.mall.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lanpi.mall.dao.BiddingDao;
import com.lanpi.mall.domain.Bidding;
import com.lanpi.mall.domain.BiddingHis;
import com.lanpi.mall.service.MallService;

@Service
public class MallServiceImpl implements MallService {
	@Autowired
	private BiddingDao biddingDao;
	
	@Override
	public List<Bidding> beingAndFutureBidding() {
		return biddingDao.beingAndFutureBidding(new Date());
	}

	@Override
	public Bidding findById(Long id) {
		return biddingDao.findById(id);
	}

	@Override
	public void bidding(Long id, Integer points) {
		Bidding bidding =biddingDao.findById(id);
		Date currentDate=new Date();
		if(currentDate.before(bidding.getStartTime())) {
			throw new RuntimeException("报价未开始...");
		}
		if(currentDate.after(bidding.getEndTime())) {
			throw new RuntimeException("报价已结束");
		}
		if(bidding.getCurrentPoints().intValue()>points.intValue()) {
			throw new RuntimeException("报价不能低于"+bidding.getCurrentPoints());
		}
		if(bidding.getCurrentPoints().intValue()==points.intValue()) {
			throw new RuntimeException("报价不能等于"+bidding.getCurrentPoints());
		}
		
		BiddingHis biddingHis=new BiddingHis();
		biddingHis.setHeadIcon("sdds");
		biddingHis.setNickName("Weinxiao");
		biddingHis.setPoints(points);
		biddingHis.setBiddingTime(currentDate);
		
		bidding.getBiddingHis().add(biddingHis);
		bidding.setCurrentPoints(points);
		biddingDao.save(bidding);
	}

}
