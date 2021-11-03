package com.accenture.service;

import com.accenture.dao.LogDao;
import com.accenture.entity.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogServiceImpl implements LogService{
    @Autowired
    LogDao dao;

    @Override
    public List<Log> recuperarLogs() {
        return dao.devolverLogs();
    }

}
