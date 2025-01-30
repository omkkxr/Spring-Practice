package com.ok.beans;

import java.util.Random;

public class CriketerBat {
	public CriketerBat() {
		System.out.println("CriketerBat :: 0-pram constructor.");
	}
	public int scoreRun() {
		System.out.println("scoreRun() method of CriketerBat.");
		int runs=new Random().nextInt(200);
		return runs;
	}
}
