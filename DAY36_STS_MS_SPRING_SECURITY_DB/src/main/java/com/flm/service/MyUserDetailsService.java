package com.flm.service;

import java.util.Optional;

import javax.management.RuntimeErrorException;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.flm.entity.MyUser;
import com.flm.repository.MyUserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MyUserDetailsService implements UserDetailsService{

	private final MyUserRepository myUserRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<MyUser> optmyUser = myUserRepository.findByUsername(username);
		if(optmyUser.isPresent())return optmyUser.get();
		throw new UsernameNotFoundException("UserName is not Found!!!");
	}

}
