package com.accenture.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.accenture.entity.Log;

@Repository
public interface ILogRepository extends CrudRepository<Log, Long> {

}