package com.accenture.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accenture.entity.Log;
import com.accenture.repository.ILogRepository;

@Service
@Transactional
public class LogService implements ILogService {
	
    @Autowired
    ILogRepository logRepository;
    
    public void save(Log log) {
    	logRepository.save(log);
    }

	public Iterable<Log> findAll(){
		return logRepository.findAll(); }

	/**
	 * Se crea instancia de log y se retorna para continuar con su actualización de estado
	 */
	@Override
	public Log registerFileProcess(String fileName, long fileLength) {
		Log log = new Log();
		
		log.setFileName(fileName);
		log.setFileLength(fileLength);
		log.setProcessDate(new Date());
		
		this.save(log);		
		
		return log;
	}

	@Override
	public void setAsMoved(Log log) {
		log.setMoved(true);
		log.setRenamed(true);
		
		save(log);		
	}
}
