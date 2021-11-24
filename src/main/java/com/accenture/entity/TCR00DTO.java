package com.accenture.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class TCR00DTO {
	
	private List<TCR00> TCR00s;
	
	public TCR00DTO() {
		this.TCR00s = new ArrayList<TCR00>();
	}

	public List<TCR00> getTransactions() {
		return TCR00s;
	}

	public void setTransactions(List<TCR00> TCR00s) {
		this.TCR00s = TCR00s;
	}
	
	public void addTransaction(TCR00 t) {
		this.getTransactions().add(t);
	}
	
	public TCR00 getFirstElement() {
		TCR00 t = this.getTransactions().get(0);
		this.getTransactions().remove(0);
		return t;
	}
	
	

}
