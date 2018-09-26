package com.bok.service.impl;

import com.bok.entity.user.UserInfo;
import com.bok.repository.IUserRepository;
import com.bok.security.JwtTokenUtil;
import com.bok.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetailsService;

public class UserServiceImpl implements IUserService {

//    https://www.cnblogs.com/hackyo/p/8004928.html

    private AuthenticationManager authenticationManager;
    private UserDetailsService userDetailsService;
    private JwtTokenUtil jwtTokenUtil;
    private IUserRepository userRepository;

    @Autowired
    public UserServiceImpl(AuthenticationManager authenticationManager, UserDetailsService userDetailsService, JwtTokenUtil jwtTokenUtil, IUserRepository userRepository) {

    }
    @Override
    public String login(String username, String password) {
        return null;
    }

    @Override
    public String register(UserInfo user) {
        return null;
    }

    @Override
    public String refreshToken(String oldToken) {
        return null;
    }
}
