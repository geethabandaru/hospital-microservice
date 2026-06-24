package com.abc.demo.HospitalApp.Service;

import java.util.List;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.demo.HospitalApp.Entity.HospitalEntity;
import com.abc.demo.HospitalApp.Repository.HospitalRepository;

@Service
public class HospitalService {
	
	@Autowired
	HospitalRepository hospitalRepo;
	
	public void createHospital(HospitalEntity hospitalDetails)
	{
		
//		System.out.println(doctorDetails.getDoctorAge());
//		System.out.println(doctorDetails.getDoctorId());
//		System.out.println(doctorDetails.getDoctorName());
//		System.out.println(doctorDetails.getDoctorSalary());
//		System.out.println(doctorDetails.getDoctorSpeciality());
		hospitalRepo.save(hospitalDetails);
	}
	public List<HospitalEntity> readAllHospitals() {
	    return hospitalRepo.findAll(); 
	}



	public HospitalEntity readParticularHospital(int id) {
	    HospitalEntity hospitalInfo=hospitalRepo.findById(id).get();
	    return hospitalInfo;








	}
	
	
	
	
	
    
}
	

