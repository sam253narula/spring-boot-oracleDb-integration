package com.spring.boot.oracledb.dto;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class MyIntroductionDTO {
	
	@Id
	Long id;
	String name;
	BigDecimal experiance;
	String skills;

}



