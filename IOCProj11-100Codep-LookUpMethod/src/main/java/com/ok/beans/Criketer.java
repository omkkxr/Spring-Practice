package com.ok.beans;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component("ckt")
public abstract class Criketer  {
	
	@Lookup
	public abstract CriketerBat createCriketBat();
	
	public void feilding() {
		System.out.println("Criketer is doing feilding. ");
	}

	public void bowling() {
		System.out.println("Criketer is doing bowling. ");
	}

	public void batting() {
		System.out.println("batting() method of Criketer. ");

		CriketerBat bat = createCriketBat();
		int runs = bat.scoreRun();
		System.out.println("Criketer is batting on : " + runs);
	}

}