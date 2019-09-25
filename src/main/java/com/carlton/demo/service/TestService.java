package com.carlton.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.carlton.demo.entity.User;
import com.carlton.demo.mapper.UserMapper;

@Service
public class TestService {

	@Autowired
	UserMapper userMapper;

	@Transactional(rollbackFor = Exception.class)//事务管理
	public int testMapper() {
		User user = new User();
		user.setAge(987);
		user.setName("555");
		int k = userMapper.insert(user);

		User user2 = userMapper.selectByPrimaryKey(user.getId());
		user2.setName(null);
		int k2 = userMapper.updateByPrimaryKey(user2);

		return k + k2;
	}
}
