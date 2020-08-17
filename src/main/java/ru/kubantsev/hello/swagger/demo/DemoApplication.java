package ru.kubantsev.hello.swagger.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import ru.kubantsev.hello.swagger.demo.dto.Profile;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(DemoApplication.class)
				.profiles(Profile.DEV.toString(),
						  Profile.PROD.toString())
				.run(args);
	}

}
