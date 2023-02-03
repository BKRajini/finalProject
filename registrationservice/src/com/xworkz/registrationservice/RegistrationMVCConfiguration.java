package com.xworkz.registrationservice;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class RegistrationMVCConfiguration extends AbstractAnnotationConfigDispatcherServletInitializer
		implements WebMvcConfigurer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		 return new Class[] { RegistrationConfiguration.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] { "/" };
	}
	/*
	 * @Override Class[] getServletConfigClasses =
	 * {RegistrationConfiguration.class}; String[] mappings = {"/"};
	 * 
	 * @Override protected Class<?>[] getRootConfigClasses() {
	 * System.out.println("This is getRootConfiguration"); return null; }
	 * 
	 * @Override protected Class<?>[] getServletConfigClasses() {
	 * System.out.println("This is getServletConfigurationClasses"); return
	 * getServletConfigClasses(); }
	 * 
	 * @Override protected String[] getServletMappings() {
	 * System.out.println("This is getServletMappings"); return mappings; }
	 * 
	 * public void configureDefaultServletHandling(DefaultServletHandlerConfigurer
	 * configurer) {
	 * System.out.println("Calling configureDefaultServletHandling Method");
	 * configurer.enable();
	 * 
	 * }
	 */
}
