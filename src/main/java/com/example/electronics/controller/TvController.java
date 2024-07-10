package com.example.electronics.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.electronics.entity.Tv;
import com.example.electronics.service.TvService;

@RequestMapping(value="/tv")
@RestController
public class TvController {
	
	@Autowired
	TvService tvs;
	
	@PostMapping(value="/create")
	public String create(@RequestBody Tv tv) {
		return tvs.create(tv);
	}
	@GetMapping(value="/getAll")
	public List<Tv> getAll(){
		return tvs.getAll();
		
	}
	@GetMapping(value="/getId/{a}")
	public Tv getId(@PathVariable int a) {
		return tvs.getId(a);
	}
	@DeleteMapping(value="/deleteId/{a}")
	public String deleteId(@PathVariable int a) {
		return tvs.deleteId(a);
	}
	@PutMapping(value="/update/{a}")
	public String updateId(@RequestBody Tv tv,@PathVariable int a) {
		return tvs.updateId(tv,a);
	}
	@GetMapping(value="/getPrice")
	public List<Integer> getBrand(){
		return tvs.getPrice();
	}

}
