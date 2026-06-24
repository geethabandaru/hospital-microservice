package com.abc.demo.HospitalApp.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "hospitals")
public class HospitalEntity {
	@Id
	
	  private int hospitalId;
	

	private String hospitalName;
	 @NotBlank

	private String hospitalLocation;
	
	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getHospitalLocation() {
		return hospitalLocation;
	}

	public void setHospitalLocation(String hospitalLocation) {
		this.hospitalLocation = hospitalLocation;
	}

	public int getHospitalId() {
		return hospitalId;
	}

	public void setHospitalId(int hospitalId) {
		this.hospitalId = hospitalId;
	}

	
	

	

	
	
	
	
	
}
