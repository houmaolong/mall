package com.xiaopixiong.mall;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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
		user.setAccount("15999772690");
		user.setOpenid("dswe9Fbdd323");
		userService.save(user);
		System.out.println(user.getId());
	}

}
