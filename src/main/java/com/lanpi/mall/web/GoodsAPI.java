package com.lanpi.mall.web;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lanpi.mall.domain.Classify;
import com.lanpi.mall.domain.Goods;
import com.lanpi.mall.service.GoodsService;

/**
 * 商品
 * 
 * @author houmaolong
 *
 */
@RestController
public class GoodsAPI extends BasicAPI {
	@Autowired
	private GoodsService  goodsService;
	/**
	 * 商品
	 * @param classifyId
	 * @param name
	 * @return
	 */
	@RequestMapping(value="/goods",method = RequestMethod.GET)
	public Map<String, Object> goods(Long classifyId,String name) {
		List<Goods> list=goodsService.find(classifyId,name);
		return SUCCESS(list);
	}
	/**
	 * 类目
	 * @return
	 */
	@RequestMapping(value="classify",method = RequestMethod.GET)
	public Map<String, Object> classify() {
		List<Classify> list=goodsService.findClassify();
		return SUCCESS(list);
	}
}
