package com.xiaopixiong.mall;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.xiaopixiong.mall.domain.Address;
import com.xiaopixiong.mall.domain.User;
import com.xiaopixiong.mall.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MallApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	private UserService userService;

	@Test
	public void insert() {
		User user = new User();
		user.setAccount("15999772692");
		user.setOpenid("oo8WK5WRoibQONTdJPpdrHpJY07s");
		userService.save(user);
		System.out.println(user.getId());
	}
	@Test
	public void addAddress() {
		Long userId=1l;
		Address address=new Address();
		userService.addAddress(userId,address);
	}
	@Test
	public void updateAddress(){
		Address address=new Address();
		address.setId(3l);
		address.setAddres("ok");
		userService.addAddress(address);
	}
	@Test
	public void findAllAdress() {
		
		List<Address> list=userService.findAllAddress();
		System.out.println(list.size());
	}
	

}
