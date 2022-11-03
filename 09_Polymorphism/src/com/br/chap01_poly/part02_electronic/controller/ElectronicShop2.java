package com.br.chap01_poly.part02_electronic.controller;

import com.br.chap01_poly.part02_electronic.model.vo.Electronic;

public class ElectronicShop2 {
	
	private Electronic[] elec = new Electronic[3];
	private int count = 0;
	
	public void insert(Electronic any) {
		elec[count++] = any;
	}
	
	public Electronic select(int index) {
		return elec[index];
	}
	

}
