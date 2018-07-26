package com.example.webdevsummer22018serverjavasp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.webdevsummer22018serverjavasp.models.Hello;

public interface HelloRepository extends CrudRepository<Hello, Integer>  {

}
