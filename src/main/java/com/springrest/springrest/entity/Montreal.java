package com.springrest.springrest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.sun.istack.NotNull;

//import com.sun.istack.NotNull;

@Entity
public class Montreal {
	
	@Id
	@NotNull
	//private long id;
	private String pid;
	@NotNull
	private String AppointmentType;
	private long Capacity;
	
	public Montreal(String pid, String AppointmentType, long Capacity) {
		super();
		this.pid = pid;
		this.AppointmentType = AppointmentType;
		this.Capacity = Capacity;
	}
	public Montreal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return pid;
	}
	public void setId(String pid) {
		this.pid = pid;
	}
	public String getTitle() {
		return AppointmentType;
	}
	@Override
	public String toString() {
		return "Course [pid=" + pid + ", AppointmentType=" + AppointmentType + ", Capacity=" + Capacity + "]";
	}
	public void setTitle(String AppointmentType) {
		this.AppointmentType = AppointmentType;
	}
	public long getDes() {
		return Capacity;
	}
	public void setDes(long Capacity) {
		this.Capacity = Capacity;
	}
	
	
}
