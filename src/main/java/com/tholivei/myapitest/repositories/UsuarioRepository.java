package com.tholivei.myapitest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tholivei.myapitest.domain.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {

}
