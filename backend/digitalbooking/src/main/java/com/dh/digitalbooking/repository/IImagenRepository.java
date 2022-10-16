package com.dh.digitalbooking.repository;

import com.dh.digitalbooking.model.Imagen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IImagenRepository extends JpaRepository<Imagen,Long> {
}
