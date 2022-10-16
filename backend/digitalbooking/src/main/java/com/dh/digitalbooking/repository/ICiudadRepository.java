package com.dh.digitalbooking.repository;

import com.dh.digitalbooking.model.Ciudad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICiudadRepository extends JpaRepository<Ciudad,Long> {



}
