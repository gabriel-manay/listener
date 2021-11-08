package com.accenture.service;

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

	@Override
	public void registerFileProcess() {
		Log log = new Log();
		this.save(log);		
	}
}
