package com.divergent.hms.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.divergent.hms.confi.AppConfig;


public class MainApp {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Menu menu = context.getBean(Menu.class);
		menu.startPanel();
	}
}
