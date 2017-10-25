package com.econetmedia.developer.interview.rest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by bmukorera on 9/10/2017.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class SampleRestObject {
	private Integer id;
	private Integer userId;
	private String title;
	private String body;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	
	@Override
	public String toString(){
		return "{\"id\":"+id+",\"userId\":"+userId+",\"title\":\""+title+"\",\"body\":\""+body+"\"}";
	}
}
