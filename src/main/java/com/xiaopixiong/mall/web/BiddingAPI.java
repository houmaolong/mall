package com.xiaopixiong.mall.web;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 竞价API
 * 
 * @author houmaolong
 *
 */
@RestController
@RequestMapping("/bidding")
public class BiddingAPI extends BasicAPI {
	@RequestMapping(method = RequestMethod.GET)
	public Map<String, Object> index() {
		return SUCCESS();
	}
}
