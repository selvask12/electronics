package com.example.electronics.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.electronics.dao.AcDao;
import com.example.electronics.entity.Ac;
@Service
public class AcService {
	
	@Autowired
	AcDao acd;

	public String create(Ac ac) {
		
		return acd.create(ac);
	}

	public List<Ac> getAll() {
		// TODO Auto-generated method stub
		
		return acd.getAll();
	}

	public Ac getId(int a) {
		// TODO Auto-generated method stub
		return acd.getId(a);
	}
 
	public String delete(int a) {
		// TODO Auto-generated method stub
		return acd.delete(a);
	}

	public String updateId(Ac ac, int a) {
		// TODO Auto-generated method stub
		Ac x=getId(a);
		x.setBrand(ac.getBrand());
		x.setPrice(ac.getPrice());
		x.setColor(ac.getColor());
		
		return acd.updateId(x);
	}

	public List<String> getBrand() {
		List<Ac> ac=acd.getAll();
		List<String> a=ac.stream().map(x->x.getBrand()).collect(Collectors.toList());
		
		return a;
		
	}

	public int getMaxPrice() {
	    List<Ac> x = acd.getAll();
	    Ac maxPrice = x.stream()
	                  .max(Comparator.comparing(Ac::getPrice))
	                  .orElse(null); // Handle the case where the list is empty

	    // Return 0 if maxPrice is null, otherwise return the max price
	    return maxPrice.getPrice();
}

	public List<String> getSortName() {
		
		List<Ac>x=acd.getAll();
		 return x.stream()
		            .map(Ac::getBrand)
		            .sorted()
		            .collect(Collectors.toList());
	}

	public List<Ac> getBrandDetails(String a) {
		List<Ac>x=acd.getAll();
		return x.stream().filter(y->y.getBrand().equals(a)).toList();
				
	}

	/*public List<Ac> getDiscount(int a) {
		List<Ac>x=acd.getAll();
		for(Ac b: x) {
			int p=b.getPrice();
			int r=p-a;
			b.setPrice(r);
			
		}
		return x;
	}*/
	public List<Ac> getDiscount(int a){
		return acd.getAll().stream().map(b-> {b.setPrice(b.getPrice()-a);
				return b;
		}).collect(Collectors.toList());
		}
	}
	
	


