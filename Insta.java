package com.runner;

import org.utilityfiles.Base_Class;

public class Insta extends Base_Class {

	public static void main(String[] args) {

		// edge browser
		browserlaunch("firefox");

		urllaunch("https://www.instagram.com/accounts/login/");

		System.out.println(title()); // just get the title

	}

}
