package com.ubante;

import com.ubante.bookmarks.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello http://spring.io/guides/tutorials/bookmarks/
 */

@SpringBootApplication
public class ThatBookmarkApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThatBookmarkApplication.class, args);
	}
//	public static void main(String[] args) {
//		SpringApplication.run(Application.class, args);
//	}
}
