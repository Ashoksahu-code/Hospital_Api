package com.springrest.springrest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.sun.istack.NotNull;
@Entity
public class Quebec {
	
	@Id
	@NotNull
	//private long id;
	private String Quebec_pid;
	private String AppointmentType;
	private long Capacity;
	
	public Quebec(String quebec_pid, String appointmentType, long capacity) {
		super();
		Quebec_pid = quebec_pid;
		AppointmentType = appointmentType;
		Capacity = capacity;
	}
	
	
	public Quebec(String string, String string2, int i) {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Quebec [Quebec_pid=" + Quebec_pid + ", AppointmentType=" + AppointmentType + ", Capacity=" + Capacity
				+ "]";
	}
	
	
	public String getQuebec_pid() {
		return Quebec_pid;
	}
	public void setQuebec_pid(String quebec_pid) {
		Quebec_pid = quebec_pid;
	}
	public String getAppointmentType() {
		return AppointmentType;
	}
	public void setAppointmentType(String appointmentType) {
		AppointmentType = appointmentType;
	}
	public long getCapacity() {
		return Capacity;
	}
	public void setCapacity(long capacity) {
		Capacity = capacity;
	}
	

}
