package com.ecom.shop.login;

import java.util.Optional;

import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/shop")
public class LoginController {
	
	@Autowired
	 LoginService  loginService;
	
	@Autowired
	LoginRepository  loginRep;
	
	@GetMapping("/get")
	public Iterable<LoginEntity> fetchAll()
	{
		return loginService.fetchAllRecords();
	
	}
	
	@GetMapping("/get/{id}")
	public Optional<LoginEntity> findId(@PathVariable Long id)
	{
		return loginService.findById(id);
	}
	
	
	@PostMapping("/post")
	public LoginEntity fetchAll(@RequestBody LoginEntity login)
	{
		return loginService.add(login);
	}
	
	@PutMapping("/put/{id}")
	public  LoginEntity findUpdate(@RequestBody LoginEntity login,@PathVariable Long id)
	{
		LoginEntity log=loginRep.findAllById(id);
//				.orElseThrow(()->ResourceNotFoundException("user not found"));
		log.setId(login.getId()); 
		log.setUsername(login.getUsername());
		log.setPwd(login.getPwd()); 
		log.setPhoneno(login.getPhoneno());
		log.setEmail(login.getEmail());
		log.setAddress(login.getAddress());
		
		LoginEntity findUpdate = loginRep.save(log);
		
		return findUpdate;
	}
//	@PostMapping("/postcheck/{id}")
	@PostMapping("/postcheck")
//    public LoginEntity postcheck(@RequestBody LoginEntity logEntity, @PathVariable Long id){

    public LoginEntity postcheck(@RequestBody LoginEntity logEntity){
        String username = logEntity.getUsername();
        String pwd = logEntity.getPwd();

        LoginEntity check = null;

        if(username!=null && pwd!=null) {
            check = fetchByUsernameAndPasswords(username,pwd);

            LoginEntity mod=loginRep.findAllByUsernameAndPwd(username, pwd);
            System.out.println(check);
            System.out.println(mod);

            if(mod.equals(check)) {
                System.out.println("Success");
            }else {
                System.err.println(" Login");
            }
        }
        return logEntity;

    }

    private LoginEntity fetchByUsernameAndPasswords(String username, String pwd) {
        // TODO Auto-generated method stub
        return loginRep.findAllByUsernameAndPwd(username,pwd);
    }
	
	

}
