package org.svgroz.imtiredoftech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.svgroz.imtiredoftech.model.PostId;
import org.svgroz.imtiredoftech.repository.PostRepository;

@SpringBootApplication
public class ImtiredoftechApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImtiredoftechApplication.class, args);
	}

}
