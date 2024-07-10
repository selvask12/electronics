package com.example.electronics.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.electronics.dao.TvDao;
import com.example.electronics.entity.Tv;
@Service
public class TvService {

	@Autowired
	TvDao tvd;
	
	public String create(Tv tv) {
		
		return tvd.create(tv);
	}

	public List<Tv> getAll() {
		// TODO Auto-generated method stub4
		
		return tvd.getAll();
	}

	public Tv getId(int a) {
		// TODO Auto-generated method stub
		return tvd.getId(a);
	}

	public String deleteId(int a) {
		// TODO Auto-generated method stub
		return tvd.deleteId(a);
	}

	public String updateId(Tv tv, int a) {
		// TODO Auto-generated method stub
		Tv x=getId(a);
		x.setBrand(tv.getBrand());
		x.setPrice(tv.getPrice());
		x.setColor(tv.getColor());
		
		return tvd.updateId(x);
	}

	public List<Integer> getPrice() {
		List<Tv> tv=tvd.getAll();
		List<Integer>x=tv.stream().map(y->y.getPrice()).collect(Collectors.toList());
		return x;
	}

}
