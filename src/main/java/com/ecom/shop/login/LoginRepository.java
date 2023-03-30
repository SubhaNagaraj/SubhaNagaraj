package com.ecom.shop.login;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends CrudRepository<LoginEntity,Integer> {

	Optional<LoginEntity> findById(Long id);

	LoginEntity findAllById(Long id);

    LoginEntity findAllById(Integer id);

    LoginEntity findAllByUsernameAndPwd(String username, String pwd);

}
