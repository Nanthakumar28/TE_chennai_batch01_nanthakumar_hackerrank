package com.te.programs;

import java.util.Scanner;

import java.util.*;
import java.io.*;

class Employee {
	
	private String name;
	private int id;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
}
class Program1 {
	
	public static void main(String[] args) 
	{
		Employee e1 = new Employee();
		e1.setId(1);
		e1.setName("nantha");
		System.out.println(e1.getId());
		System.out.println(e1.getName());
		
    }
}
