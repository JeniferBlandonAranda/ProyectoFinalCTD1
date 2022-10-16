package com.dh.digitalbooking.repository;

import com.dh.digitalbooking.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
@Transactional
public interface IUsuarioRepository extends JpaRepository <Usuario,Long> {

    Usuario findByEmail(String email);

}
