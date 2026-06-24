package com.abc.demo.HospitalApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.demo.HospitalApp.Entity.HospitalEntity;
import com.abc.demo.HospitalApp.Service.HospitalService;

@RestController
@RequestMapping("/hospital")
public class HospitalController {
	
	@Autowired
	HospitalService hospitalService;
	
	@PostMapping("/create")
	public void recieveData(@RequestBody HospitalEntity hospitalDetails)
	{

		
		hospitalService.createHospital(hospitalDetails);
			
	}
	@GetMapping("/read")
    public List<HospitalEntity> getAllHospitals() {
        return hospitalService.readAllHospitals();
    }

    // READ BY ID
    @GetMapping("/read/{id}")
    public HospitalEntity getHospitalById(@PathVariable int id) {
        return hospitalService.readParticularHospital(id);
    }
	
	

}
