package com.dotridge.nhc.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * The Class AppInitializer. registers front controller configures root config and servlet config
 */
public class WebAppInitializer implements WebApplicationInitializer {

  @Override
  public void onStartup(ServletContext servletContext) throws ServletException {
    AnnotationConfigWebApplicationContext webApplicationContext =
        new AnnotationConfigWebApplicationContext();

    webApplicationContext.setServletContext(servletContext);

    webApplicationContext.register(WebMvcConfig.class, ApplicationConfig.class);

    ServletRegistration.Dynamic dispatcherServlet = servletContext.addServlet("dispatcherServlet",
        new DispatcherServlet(webApplicationContext));

    dispatcherServlet.addMapping("/");

    dispatcherServlet.setLoadOnStartup(1);
    
  }

}
