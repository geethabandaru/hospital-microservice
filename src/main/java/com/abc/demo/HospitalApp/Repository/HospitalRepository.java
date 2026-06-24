package com.abc.demo.HospitalApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.demo.HospitalApp.Entity.HospitalEntity;

public interface HospitalRepository extends JpaRepository<HospitalEntity,Integer>{

}
