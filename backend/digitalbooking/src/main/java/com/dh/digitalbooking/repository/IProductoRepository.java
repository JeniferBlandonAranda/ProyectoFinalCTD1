package com.dh.digitalbooking.repository;

import com.dh.digitalbooking.model.Caracteristica;
import com.dh.digitalbooking.model.Categoria;
import com.dh.digitalbooking.model.Ciudad;
import com.dh.digitalbooking.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Repository
public interface IProductoRepository extends JpaRepository<Producto,Long> {

    @Transactional
    @Modifying
    @Query("update Producto set nombre = ?1, tituloDescripcion = ?2, descripcion = ?3, categoria = ?4, ciudad = ?5, caracteristica = ?6 where id =?7")
    void updateById(String nombre, String titulo, String descripcion, Categoria categoria, Ciudad ciudad, List <Caracteristica> caracteristicas, Long id);

    @Query("select p from Producto p where ciudad_id =?1")
    List <Producto> listarSegunCiudad(Long idCiudad);

    @Query("select p from Producto p where categoria_id =?1")
    List <Producto> listarSegunCategoria(Long idCategoria);

}
