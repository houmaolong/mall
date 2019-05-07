package com.lanpi.mall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lanpi.mall.dao.AddressDao;
import com.lanpi.mall.dao.UserDao;
import com.lanpi.mall.domain.Address;
import com.lanpi.mall.domain.User;
import com.lanpi.mall.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	@Autowired
	private AddressDao addressDao;

	@Override
	public void save(User user) {
		userDao.save(user);
	}

	@Override
	public void addAddress(Address address) {
 		addressDao.save(address);
	}

	@Override
	public List<Address> findAddress(Long userId) {
		return addressDao.findByUserId(userId);
	}

	@Override
	public List<Address> findAllAddress() {
		return addressDao.findAll();
	}

	@Override
	public void addAddress(Long userId, Address address) {
		addressDao.save(address);
	}
	
}
