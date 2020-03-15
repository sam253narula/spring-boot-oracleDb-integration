package com.spring.boot.oracledb.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.boot.oracledb.dto.MyIntroductionDTO;

@Repository
public interface MyIntroRepo extends CrudRepository<MyIntroductionDTO, Long>  {

}
