package com.accenture.service;

import com.accenture.entity.Log;

public interface ILogService {
	
	 void save(Log log);
     void registerFileProcess();
	 Iterable<Log> findAll();
//    List<Log> recuperarLogs();
//    void guardarLog();

}
