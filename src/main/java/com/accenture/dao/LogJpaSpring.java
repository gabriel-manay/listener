package com.accenture.dao;

import com.accenture.entity.Log;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogJpaSpring extends JpaRepository<Log, Integer> {
    //Log findById(int clave);//implementacion que nos va hacer Spring

}