package com.accenture.dao;

import com.accenture.entity.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LogDaoImpl implements LogDao {

    @Autowired
    LogJpaSpring log;//inyecte una implementacion de esa interfaz


    @Override
    public List<Log> devolverLogs() {

        return log.findAll();
    }

}
