package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Bike;
import com.example.demo.repository.BikeRepo;

@Service
public class BikeService {
	@Autowired
	BikeRepo br;
	
	public List<Bike> post(List<Bike> b)
	{
		return br.saveAll(b);
	}
	
	public List<Bike> getByYear(int y)
	{
		return br.getBike(y);
	}
	
	public List<Bike> getByNameYear(int y,String name)
	{
		return br.getFromyearname(y, name);
	}
	
	public List<Bike> getByName(String name)
	{
		return br.getBikeName(name);
	}

}