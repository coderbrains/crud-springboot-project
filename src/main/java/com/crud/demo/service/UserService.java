package com.crud.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.demo.dao.UserDao;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;

}
