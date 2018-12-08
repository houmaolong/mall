package com.xiaopixiong.mall.service;

import java.util.List;

import com.xiaopixiong.mall.domain.Address;
import com.xiaopixiong.mall.domain.User;
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
