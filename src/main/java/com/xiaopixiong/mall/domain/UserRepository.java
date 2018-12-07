package com.xiaopixiong.mall.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * User 数据持久层操作接口
 * 
 * @author houmaolong
 *
 */
public interface UserRepository extends  CrudRepository<User, Long> {
}
