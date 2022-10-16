package com.dh.digitalbooking.service;


import com.dh.digitalbooking.model.Ciudad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dh.digitalbooking.repository.ICiudadRepository;

import java.util.List;

@Service
public class CiudadService {

    @Autowired
    private ICiudadRepository iCiudadRepository ;

    public Ciudad agregarCiudad(Ciudad ciudad){
        return iCiudadRepository.save(ciudad);
    }

    public Ciudad buscarPorId(Long id){
        Ciudad ciudad = iCiudadRepository.findById(id).get();
        return ciudad;
    }

    public List<Ciudad> listarCiudades(){
        List<Ciudad> ciudades = iCiudadRepository.findAll();
        return ciudades;
    }

}
