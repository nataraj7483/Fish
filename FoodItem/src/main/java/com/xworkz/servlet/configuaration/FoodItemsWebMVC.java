package com.xworkz.servlet.configuaration;


import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class FoodItemsWebMVC extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	public FoodItemsWebMVC() {
		System.out.println("running " + this.getClass().getSimpleName());
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("running getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("running getServletConfigClasses");
		Class[] ref = { FoodItemsConfiguaration.class };
		return ref;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("running getServletMappings ");
		return new String[] { "/" };
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("running configureDefaultServletHandling");
		configurer.enable();
	}
}
