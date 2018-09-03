package com.mongo.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongo.model.Address;
import com.mongo.model.AppUser;
import com.mongo.repository.AddressRepository;
import com.mongo.repository.UserRepository;
import com.mongo.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	@Autowired
	AddressRepository adRepo;
	@Override
	public void saveUser(AppUser bean) {
		AppUser user = new AppUser();	
		user.setId(bean.getId());
		user.setFirstName(bean.getFirstName());
		user.setLastName(bean.getLastName());
		List<Address> adList = new ArrayList<>();
		bean.getAddress().forEach((aBean)->{
			Address address = new Address();
			address.address1=aBean.getAddress1();
			address.state=aBean.getState();
			address.id=aBean.getId();
			adList.add(address);
			adRepo.save(address);
		});
		user.setAddress(adList);
		userRepository.save(user);
	}
	@Override
	public List<AppUser> getUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}
	

	
}
