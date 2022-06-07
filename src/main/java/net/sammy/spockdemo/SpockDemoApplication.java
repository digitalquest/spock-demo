package net.sammy.spockdemo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
//@RequiredArgsConstructor
public class SpockDemoApplication {
	private final BootStrap bootStrap;

	public SpockDemoApplication(BootStrap bootStrap) {
		super();
		this.bootStrap = bootStrap;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpockDemoApplication.class, args);
	}
	
	public void run(ApplicationArguments args) {
		bootStrap.init();
	}

}
