package com.dh.digitalbooking.service;

import com.dh.digitalbooking.model.Imagen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dh.digitalbooking.repository.IImagenRepository;

import java.util.List;

@Service
public class ImagenService {

    @Autowired
    private IImagenRepository iImagenRepository;

    public void subirImagen(Imagen imagen){
        iImagenRepository.save(imagen);
    }

    public Imagen buscarPorId(Long id){
       Imagen imagen = iImagenRepository.findById(id).get();
        return imagen;
    }


    public List<Imagen> listarImagenes(){
        List<Imagen> imagen = iImagenRepository.findAll();
        return imagen;
    }

    public void deleteById(Long id){
        iImagenRepository.deleteById(id);

    }




}
