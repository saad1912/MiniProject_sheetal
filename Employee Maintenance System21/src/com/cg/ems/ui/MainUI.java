package com.cg.ems.ui;

import java.util.Scanner;

import org.apache.log4j.PropertyConfigurator;

import com.cg.ems.bean.Employee;
import com.cg.ems.dao.AdminDaoImpl;
import com.cg.ems.dao.IAdminDao;
import com.cg.ems.service.AuthenticationServiceImpl;
import com.cg.ems.service.IAuthenticationService;

public class MainUI {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PropertyConfigurator.configure("resources/log4j.properties");

		int choice = -1;

		int loginAttempts = 0;
		IAuthenticationService service = new AuthenticationServiceImpl();

		AdminConsole admin = null;
		EmployeeConsole emp = null;
		while (choice != 2 && loginAttempts <= 3) {
			showChoices();
			choice = scan.nextInt();

			if (choice == 1) {
				System.out.print("UserName ? ");
				String userName = scan.next();
				System.out.print("Password ? ");
				String userPassword = scan.next();
				loginAttempts++;
				boolean login = service.loginSuccessful(userName, userPassword);
				if (login == true) {
					admin = new AdminConsole();
					admin.start();
				} else
					System.out.println("Invalid Username or Password");
			}
			if (choice == 2) {
				System.out.print("UserName? ");
				String userName = scan.next();
				System.out.print("Password? ");
				String userPassword = scan.next();
				loginAttempts++;
				boolean login = service.loginSuccessful(userName, userPassword);
				if (login == true) {
					emp = new EmployeeConsole();
					emp.start();
				} else
					System.out.println("Invalid Username or Password");

			}

		}
		if (loginAttempts>3) {
			System.out.println("login attempts exceeded!!!!!!!");
		}
		
		scan.close();
		System.out.println("Program Terminated");
		System.out.println("Thankyou, Visit Again!!!!");

	}

	private static void showChoices() {

		System.out.println("[1] Login as Admin");
		System.out.println("[2] Login as Employee");
		System.out.println("[3] Exit");
		System.out.print("Your Choice ? ");

	}
}
