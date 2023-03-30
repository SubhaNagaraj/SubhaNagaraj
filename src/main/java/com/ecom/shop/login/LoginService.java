package com.ecom.shop.login;

import java.util.Optional;

import javax.persistence.Id;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class LoginService {
	

	
	@Autowired
	LoginRepository loginRepository;

	public Iterable<LoginEntity> fetchAllRecords() {
		
     return loginRepository.findAll();

	}

	public LoginEntity add(LoginEntity login) {
		// TODO Auto-generated method stub
		return loginRepository.save(login);
	}

	public Optional<LoginEntity> findById(Long id) {
		// TODO Auto-generated method stub
		return loginRepository.findById(id);
	}		

}
