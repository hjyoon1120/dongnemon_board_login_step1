package com.dongnemon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dongnemon.dao.UserDAO;
import com.dongnemon.domain.UserVO;
import com.dongnemon.dto.LoginDTO;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO dao;

	@Override
	public UserVO login(LoginDTO dto) throws Exception {
		return dao.login(dto);
	}
}
