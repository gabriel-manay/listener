package com.accenture.service;

import com.accenture.entity.Log;

import java.util.List;

public interface LogService {
    List<Log> recuperarLogs();
    void guardarLog();

}
