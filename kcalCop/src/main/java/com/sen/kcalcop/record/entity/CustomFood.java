package com.sen.kcalcop.record.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.sen.kcalcop.member.entity.Member;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor 
@DiscriminatorValue("CustomFood") 
public class CustomFood extends Food {
 
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="member")  
	private Member member;  
	 
}