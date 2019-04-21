package com.xiaopixiong.mall.dao;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.repository.Repository;

import com.xiaopixiong.mall.domain.Goods;

/**
 * 数据持久层操作接口
 * 
 * @author houmaolong
 *
 */
public interface GoodsDao extends Repository<Goods, Long> {
	List<Goods> findAll(Specification<Goods> querySpecifi);

	List<Goods> findAll();
}
