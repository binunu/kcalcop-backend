package com.sen.kcalcop.record.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor 
@Inheritance(strategy = InheritanceType.JOINED) 
@DiscriminatorColumn(name = "DTYPE")
public class Food { 
	@Id
	private Integer foodNum;
	@Column
	private String foodName;
	@Column
	private Integer kcal;
	@Column
	private String weight;
}
