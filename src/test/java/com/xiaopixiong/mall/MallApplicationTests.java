package com.xiaopixiong.mall;

import java.io.File;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.google.common.collect.Lists;
import com.xiaoleilu.hutool.lang.Base64;
import com.xiaopixiong.mall.dao.ClassifyDao;
import com.xiaopixiong.mall.domain.Address;
import com.xiaopixiong.mall.domain.Classify;
import com.xiaopixiong.mall.domain.Image;
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

	@Autowired
	private ClassifyDao classifyDao;
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
	@Test
	public void insertClassify() {
		List<Image> images=Lists.newArrayList();
		Classify classify=new Classify();
		classify.setName("新学期");
		byte[] filebytes=com.xiaoleilu.hutool.io.FileUtil.readBytes(new File("C:\\Users\\houmaolong\\Pictures\\Saved Pictures\\test.jpg"));
		System.out.println(Base64.encode(filebytes));
		Image image=new Image();
		image.setType(Image.Type.classify);
		image.setFileData(Base64.encode(filebytes));
		images.add(image);
		classify.setImages(images);
		classifyDao.save(classify);
		 
	}
	@Test
	public void findClassify() {
		Classify classify=classifyDao.findById(1L);
		byte[] filebytes=com.xiaoleilu.hutool.io.FileUtil.readBytes(new File("C:\\Users\\houmaolong\\Pictures\\Saved Pictures\\test.jpg"));
		Image image=new Image();
		image.setType(Image.Type.classify);
		image.setFileData(Base64.encode(filebytes));
		classify.getImages().add(image);
		classifyDao.save(classify);
		 System.out.println(classify);
	}

}
