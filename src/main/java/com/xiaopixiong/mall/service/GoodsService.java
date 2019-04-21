package com.xiaopixiong.mall.service;

import java.util.List;

import com.xiaopixiong.mall.domain.Classify;
import com.xiaopixiong.mall.domain.Goods;

/**
 * 商城管理
 * 
 * @author houmaolong
 *
 */
public interface GoodsService {

	List<Goods> find(Long classifyId, String name);

	List<Classify> findClassify();
}
