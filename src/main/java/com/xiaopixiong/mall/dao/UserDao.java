package com.xiaopixiong.mall.dao;

import org.springframework.data.repository.Repository;

import com.xiaopixiong.mall.domain.User;

/**
 * 数据持久层操作接口
 * 
 * @author houmaolong
 *
 */
public interface UserDao extends  Repository<User, Long> {

	void save(User user);
}
