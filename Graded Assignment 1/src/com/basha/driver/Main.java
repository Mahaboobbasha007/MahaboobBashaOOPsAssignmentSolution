package com.basha.driver;

import com.basha.departments.AdminDepartment;
import com.basha.departments.HRDepartment;
import com.basha.departments.SuperDepartment;
import com.basha.departments.TechDepartment;

public class Main {

	public static void main(String[] args) {

		SuperDepartment sd = new SuperDepartment();

		AdminDepartment admin = new AdminDepartment();
		TechDepartment tech = new TechDepartment();
		HRDepartment hr = new HRDepartment();
		// Admin Department
		System.out.println(admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(sd.isTodayAHoliday());
		System.out.println();
		System.out.println();
		// Tech Department
		System.out.println(tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(sd.isTodayAHoliday());
		System.out.println();
		System.out.println();

		// HR Department
		System.out.println(hr.departmentName());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.doActivity());
		System.out.println(sd.isTodayAHoliday());
	}

}
