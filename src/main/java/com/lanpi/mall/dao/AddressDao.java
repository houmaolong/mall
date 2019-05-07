package com.lanpi.mall.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import com.lanpi.mall.domain.Address;

/**
 * 数据持久层操作接口
 * 
 * @author houmaolong
 *
 */
public interface AddressDao extends Repository<Address, Long> {
	@Query("from Address a where a.user.id=:userId")
	List<Address> findByUserId(@Param("userId")Long userId);

	void save(Address address);

	List<Address> findAll();
}
