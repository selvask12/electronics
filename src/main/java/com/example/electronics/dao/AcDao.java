package com.example.electronics.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.electronics.entity.Ac;
import com.example.electronics.repository.AcRepository;
@Repository
public class AcDao {

	@Autowired
	AcRepository acr;
	public String create(Ac ac) {
		// TODO Auto-generated method stub
		acr.save(ac);
		return "saved";
	}
	public List<Ac> getAll() {
		// TODO Auto-generated method stub
		return acr.findAll();
     	
	}
	public Ac getId(int a) {
		// TODO Auto-generated method stub
		return acr.findById(a).get();
	}
	public String delete(int a) {
		// TODO Auto-generated method stub
		acr.deleteById(a);
		return "deleted";
	
	}
	public String updateId(Ac x) {
		
		acr.save(x);
		// TODO Auto-generated method stub
		return "updated";
	}

}
