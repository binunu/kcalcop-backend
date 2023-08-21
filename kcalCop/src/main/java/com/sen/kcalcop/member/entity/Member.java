package com.sen.kcalcop.member.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.sen.kcalcop.record.entity.CustomFood;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Member {
	@Id
	private String email;
	@Column
	private String password;
	@Column
	private String nickname;
	@Column
	private Integer goalKcal;
	@Column
	private String sucPhrases;
	@Column
	private String failPhrases; 
	 
	@OneToMany(mappedBy="member", fetch=FetchType.EAGER)
	private List<CustomFood> customFoods = new ArrayList<>(); 
	
}
