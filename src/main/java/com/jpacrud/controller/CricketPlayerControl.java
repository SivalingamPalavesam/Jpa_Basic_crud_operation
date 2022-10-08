package com.jpacrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jpacrud.model.CricketPlayer;
import com.jpacrud.service.CricketPlayerService;

@RestController
public class CricketPlayerControl
{
	@Autowired
	CricketPlayerService cricketplayerservice;
	
	@RequestMapping(value="/insertValue",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public String insertData(@RequestBody CricketPlayer cricketplayer )
	{
		boolean status = cricketplayerservice.inserData(cricketplayer);
		
		if(status) return "Data insert Successfully";
		else return "Invalid Data"; 
		
	}
	
	@RequestMapping(value="/putValue",method=RequestMethod.PUT,consumes =MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public String updateData(@RequestBody CricketPlayer cricketlayer )
	{
		 boolean status = cricketplayerservice.updateData(cricketlayer);
		 if(status)
			 	return "The update data is Successfully";
		 else
		 		return "Invalid Data";
	}
	@RequestMapping(value="/getallValue",method = RequestMethod.GET )
	
	public List<CricketPlayer> getData()
	{
		return cricketplayerservice.getData();
	}

	@RequestMapping(value="deleteValue",method=RequestMethod.DELETE)
	public String deleteData(@RequestParam ("crtNumber")int id)
	{
		boolean status = cricketplayerservice.deleteData(id);
		if(status)
			return "Data delete is successfully";
		else
			return "Invalid data";
	}
}

