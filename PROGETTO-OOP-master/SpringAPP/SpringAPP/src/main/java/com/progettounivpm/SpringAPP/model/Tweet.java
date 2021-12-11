package com.progettounivpm.SpringAPP.model;

import java.util.ArrayList;

public class Tweet {

	private String created_at;
	private long Id;
	private String text;
	private ArrayList<String> hashtags;
	private String[] coordinates; // [lon,lat]
	private String[] place; //country code
	
	public Tweet(String created_at, long Id, String text, ArrayList<String>hashtags, String[]coordinates,String[] place ) {
		
		this.created_at=created_at;
		this.Id=Id;
		this.text=text;
		this.hashtags=hashtags;
		this.coordinates=coordinates;
		this.place=place;
		
	}
	
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at=created_at;
	}

	public long getId() {
		return Id;
	}
	public void setId(long Id) {
		this.Id=Id;	
	}
	
	public   String gettext() {
		return text;
	}
	public void settext(String text) {
		this.text=text;
		
	}
	
	public ArrayList<String> gethashtags() {
		return hashtags;
	}
	public  void sethashtags(ArrayList<String> hashtags){
		this.hashtags=hashtags;
	}
	
	public String[] getcoordinates() {
		return coordinates;
	}
	public void setcoordinates(String[] coordinates) {
		this.coordinates=coordinates;
	}
	
	public String[] getplace() {
		return place;
	}
	public void setplace(String[] place) {
		this.place=place;
	}  
}
