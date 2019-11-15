package com.nt.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

public class Employee {

	private int eid;
	private String name;
	private Adress adress;
	public Employee() {
		System.out.println("Employee:: 0-param constructor");
	}
	public Employee(int eid, String name, Adress adress) {
		this.eid = eid;
		this.name = name;
		this.adress = adress;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Adress getAdress() {
		return adress;
	}
	public void setAdress(Adress adress) {
		this.adress = adress;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", adress=" + adress + "]";
	}
	public void details() {
		System.out.println( eid+ "  "+name+"   " + adress);
	}
	
	
}
