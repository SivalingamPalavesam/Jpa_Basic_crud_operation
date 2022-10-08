package com.jpacrud.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cricketplayer")
public class CricketPlayer 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "crtNumber")
	private int crtNumber;
	
	@Column(name = "crtName")
	private String crtName;
	
	public String getCrtName() 
	{
		return crtName;
	}
	public void setCrtName(String crtName)
	{
		this.crtName = crtName;
	}
	public int getCrtNumber() 
	{
		return crtNumber;
	}
	public void setCrtNumber(int crtNumber)
	{
		this.crtNumber = crtNumber;
	}
}
