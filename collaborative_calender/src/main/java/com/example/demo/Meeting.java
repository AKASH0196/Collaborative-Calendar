package com.example.demo;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="meetingInfo")
public class Meeting {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	
	 @Column(nullable=false, length=45)
	 private String creator;
	 
	 @Column(nullable=true, length=64)
	 private String meetingWith;
	 
	 @Column(nullable=false)
	 private String startTime;
	 
	 @Column(nullable=false, length=20)
	 private String endTime;
	 
	 @Column(nullable=true, length=64)
	 private Long flag;

	public Long getFlag() {
		return flag;
	}

	public void setFlag(Long flag) {
		this.flag = flag;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getMeetingWith() {
		return meetingWith;
	}

	public void setMeetingWith(String meetingWith) {
		this.meetingWith = meetingWith;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	 
	 
	
}
