package com.df.bootjpa.dao;

import org.springframework.data.repository.CrudRepository;

import com.df.bootjpa.model.Alien;

public interface AlienRepo extends CrudRepository<Alien, Integer>{

}
