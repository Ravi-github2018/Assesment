package com.rabobank.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rabobank.model.Record;


@Service
public interface ValidatorService {
	
	public List<Record> getDuplicateRecords(List<Record> records);
	
	public List<Record> getEndBalanceErrorRecords(List<Record> records);

}
