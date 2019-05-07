package com.lanpi.mall.service;

import java.util.List;

import com.lanpi.mall.domain.Address;
import com.lanpi.mall.domain.User;
/**
 * 用户管理
 * @author houmaolong
 *
 */
public interface UserService {

	void save(User user);

	void addAddress(Address address);

	List<Address> findAddress(Long userId);

	List<Address> findAllAddress();

	void addAddress(Long userId, Address address);

}
