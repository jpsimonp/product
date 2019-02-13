package com.example.rest.data;

/**
 * 
 * @author jpsimon
 * 
 * Common data class is shared in project and product and it is the same in both
 *
 */
public class CommonData {
	
	private String evolution1;
	private int evolution2;
	
	public CommonData(String e) {
		this.evolution1 = e;
	}
	
	public CommonData(String e, int e2) {
		this.evolution1 = e;
		this.evolution2 = e2;
	}

	public String getEvolution1() {
		return evolution1;
	}

	public void setEvolution1(String evolution1) {
		this.evolution1 = evolution1;
	}

	public int getEvolution2() {
		return evolution2;
	}

	public void setEvolution2(int evolution2) {
		this.evolution2 = evolution2;
	}
}
