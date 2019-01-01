package com.xiaopixiong.mall.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiaopixiong.mall.dao.BiddingDao;
import com.xiaopixiong.mall.domain.Bidding;
import com.xiaopixiong.mall.service.MallService;

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

}
