package com.xiaopixiong.mall.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import com.xiaopixiong.mall.domain.Bidding;

/**
 * 数据持久层操作接口
 * 
 * @author houmaolong
 *
 */
public interface BiddingDao extends Repository<Bidding, Long> {
	@Query("from Bidding where :now <= endTime")
	List<Bidding> beingAndFutureBidding(@Param("now") Date now);
	
	Bidding findById(Long id);
}
