package com.xiaopixiong.mall.web;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xiaopixiong.mall.domain.Bidding;
import com.xiaopixiong.mall.service.MallService;

/**
 * 竞价API
 * 
 * @author houmaolong
 *
 */
@RestController
@RequestMapping("/bidding")
public class BiddingAPI extends BasicAPI {
	@Autowired
	private MallService  mallService;
	@RequestMapping(method = RequestMethod.GET)
	public Map<String, Object> index() {
		List<Bidding> list=mallService.beingAndFutureBidding();
		return SUCCESS(list);
	}
	@RequestMapping(value="/get",method = RequestMethod.GET)
	public Map<String, Object> detail(Long id) {
		Bidding bidding=mallService.findById(id);
		return SUCCESS(bidding);
	}
	@RequestMapping(method = RequestMethod.POST)
	public Map<String, Object> bidding(Long id,Integer points) {
		 mallService.bidding(id,  points);
		return SUCCESS();
	}
}
