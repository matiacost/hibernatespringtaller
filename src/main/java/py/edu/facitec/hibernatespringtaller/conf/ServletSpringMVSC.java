package py.edu.facitec.hibernatespringtaller.conf;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ServletSpringMVSC extends AbstractAnnotationConfigDispatcherServletInitializer{

	
	protected Class<?>[] getRootConfigClasses() {
		return new Class[]{AppWebConfiguaration.class, JPAConfiguration.class};
	}

	
	protected Class<?>[] getServletConfigClasses() {
		return null;
	}

	
	protected String[] getServletMappings() {
		return new String[]{"/"};
	}



}
