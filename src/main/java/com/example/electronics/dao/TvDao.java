package com.example.electronics.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.electronics.entity.Tv;
import com.example.electronics.repository.TvRepository;
@Repository
public class TvDao {

	@Autowired
	TvRepository tvr;
	
	public String create(Tv tv) {
		
		tvr.save(tv);
		return "saved";
	}

	public List<Tv> getAll() {
		// TODO Auto-generated method stub
		 return tvr.findAll();
		
	}

	public Tv getId(int a) {
		// TODO Auto-generated method stub
        return tvr.findById(a).get();
	
	}

	public String deleteId(int a) {
		// TODO Auto-generated method stub
		tvr.deleteById(a);
		return "deleted";
	}

	public String updateId(Tv x) {
		// TODO Auto-generated method stub
		tvr.save(x);
		return "updated";
	}
}
