package com.example.myRentACar;

import org.springframework.boot.SpringApplication;

public class TestMyRentACarApplication {

	public static void main(String[] args) {
		SpringApplication.from(MyRentACarApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
