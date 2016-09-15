package py.edu.facitec.hibernatespringtaller.conf;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import py.edu.facitec.hibernatespringtaller.controller.HomeController;
import py.edu.facitec.hibernatespringtaller.dao.ClienteDAO;

@EnableWebMvc

@ComponentScan(basePackageClasses={HomeController.class, ClienteDAO.class})
public class AppWebConfiguaration extends WebMvcConfigurerAdapter {

	@Bean
	public InternalResourceViewResolver internalResourceViewResolver(){

		InternalResourceViewResolver resolver = new InternalResourceViewResolver(); 

		resolver.setPrefix("WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}


}//END
