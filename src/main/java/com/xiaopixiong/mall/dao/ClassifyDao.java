package com.xiaopixiong.mall.dao;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.xiaopixiong.mall.domain.Classify;

/**
 * 数据持久层操作接口
 * 
 * @author houmaolong
 *
 */
public interface ClassifyDao extends Repository<Classify, Long> {

	List<Classify> findAll();

	void save(Classify classify);

	Classify findById(long id);
	 
}
