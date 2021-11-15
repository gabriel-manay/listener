package com.accenture.service;

import com.accenture.entity.Log;

public interface ILogService {

	public void save(Log log);

	public Log registerFileProcess(String fileName, long fileLength);

	public Iterable<Log> findAll();

	public void setAsMoved(Log log);

}
