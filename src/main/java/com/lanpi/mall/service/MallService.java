package com.lanpi.mall.service;

import java.util.List;

import com.lanpi.mall.domain.Bidding;

/**
 * 商城管理
 * 
 * @author houmaolong
 *
 */
public interface MallService {
	/**
	 * 竞拍列表
	 * 
	 * @return
	 */
	List<Bidding> beingAndFutureBidding();

	/**
	 * 详情
	 * @param id
	 * @return
	 */
	Bidding findById(Long id);

	void bidding(Long id, Integer points);

}
