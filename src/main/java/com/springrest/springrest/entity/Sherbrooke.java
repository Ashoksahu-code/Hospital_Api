package com.springrest.springrest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.sun.istack.NotNull;

@Entity
public class Sherbrooke {
	
	@Id
	@NotNull
	
	private String Sherbrooke_pid;
	private String AppointmentType;
	private long Capacity;
	
	public Sherbrooke(String sherbrooke_pid, String appointmentType, long capacity) {
		super();
		Sherbrooke_pid = sherbrooke_pid;
		AppointmentType = appointmentType;
		Capacity = capacity;
	}
	
	public Sherbrooke() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Sherbrooke [Sherbrooke_pid=" + Sherbrooke_pid + ", AppointmentType=" + AppointmentType + ", Capacity="
				+ Capacity + "]";
	}
	
	public String getSherbrooke_pid() {
		return Sherbrooke_pid;
	}
	public void setSherbrooke_pid(String sherbrooke_pid) {
		Sherbrooke_pid = sherbrooke_pid;
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

