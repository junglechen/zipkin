package cn.jungle.cloud.zipkin;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;





@SpringBootApplication
@EnableZipkinServer
public class ZipkinApp {
	public static void main(String[] args) {
		SpringApplication.run(ZipkinApp.class, args);
		System.out.println("Hello ZipkinApp");
	}

}