package com.tcs;

import java.util.Locale;
import java.util.ResourceBundle;

public class Login {

	public static void main(String[] args) {
		
		Locale locale = new Locale("fr","CA");
		ResourceBundle resourceBundle = ResourceBundle.getBundle("login",locale);
		String string = resourceBundle.getString("msg");
		System.out.println(string);

	}

}
