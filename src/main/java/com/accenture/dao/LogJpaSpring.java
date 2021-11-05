package com.accenture.dao;

import com.accenture.entity.Log;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface LogJpaSpring extends JpaRepository<Log, Integer> {

    //Log findById(int clave);//implementacion que nos va hacer Spring

}