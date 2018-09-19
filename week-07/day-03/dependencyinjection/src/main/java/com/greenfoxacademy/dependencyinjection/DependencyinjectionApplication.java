package com.greenfoxacademy.dependencyinjection;

import com.greenfoxacademy.dependencyinjection.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencyinjectionApplication implements CommandLineRunner {

  @Autowired
	Printer printer;

	public static void main(String[] args) {
		SpringApplication.run(DependencyinjectionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		printer.log("Hello World!");
	}
}
