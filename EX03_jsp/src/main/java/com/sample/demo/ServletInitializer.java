package com.sample.demo;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
<<<<<<< HEAD
		return application.sources(Ex01DiApplication.class);
=======
		return application.sources(Ex03JspApplication.class);
>>>>>>> ccbab79 (first)
	}

}
