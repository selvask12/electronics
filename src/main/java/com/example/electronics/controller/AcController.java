package com.example.electronics.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.electronics.entity.Ac;
import com.example.electronics.service.AcService;
import org.springframework.web.bind.annotation.PutMapping;




@RequestMapping(value="/ac")
@RestController
public class AcController {

	@Autowired
	AcService acs;
	
	@PostMapping(value="/create")
	public String create(@RequestBody Ac ac) {
		return acs.create(ac);
	}
	
	@GetMapping(value="/get")
	public List<Ac> getAll(){
		return acs.getAll();
	}
	
	@GetMapping(value="/getId/{a}")
	public Ac getId(@PathVariable int a) {
		return acs.getId(a);
	}
	@DeleteMapping(value="/deleteId/{a}")
	public String delete(@PathVariable int a) {
		return acs.delete(a);
	}
	@PutMapping(value="/update/{a}")
	public String updateId(@RequestBody Ac ac,@PathVariable int a) {
		return acs.updateId(ac,a);
	
	}
	@GetMapping(value="/getBrand")
	public List<String> getBrand(){
		return acs.getBrand();
	}
	@GetMapping(value="/getMaxPrice")
	public int getMaxPrice() {
		return acs.getMaxPrice();
	}
	@GetMapping(value="/getSortName")
	public List<String> getSortName() {
		return acs.getSortName();
	}
	@GetMapping(value="/getBrandDetails/{a}")
	public List<Ac> getBrandDetails(@PathVariable String a ) {
		return acs.getBrandDetails(a);
	}
	@GetMapping(value="/getDiscountPrice/{a}")
	public List<Ac> getDiscount(@PathVariable int a) {
		return acs.getDiscount(a);
	}	
}
