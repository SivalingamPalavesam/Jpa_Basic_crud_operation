package com.jpacrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.jpacrud.model.CricketPlayer;
import com.jpacrud.repository.CricketPlayerRepo;

@Component
public class CricketPlayerService
{
	@Autowired
	CricketPlayerRepo cricketplayerrepo;
	public boolean inserData(CricketPlayer cricketplayer)	
	{
		 boolean flag =false;
		 cricketplayerrepo.save(cricketplayer);
		 flag = true;
		 return flag;	
	}
	public List<CricketPlayer> getData() 
	{
		return cricketplayerrepo.findAll();
	}
	public boolean updateData(CricketPlayer cricketlayer) 
	{
		boolean flag = false;
		cricketplayerrepo.saveAndFlush(cricketlayer);
		flag = true;
		return flag;
	}
	public boolean deleteData(int crtNumber)
	{
		boolean flag =false;
		cricketplayerrepo.deleteById(crtNumber);
		flag= true;
		return flag;
	}

	
}
