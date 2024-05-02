package net.abcbs.eae.jaxrs;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
/***********************************************************************************************************************************************************************
 * @Author ABCBS Resource
 * 
 * Description: RPALexisNexisApplication class will be used as the application driver
 * 
 * Project: Lexis Nexis LookUp Phone Number
 ***********************************************************************************************************************************************************************/
@ApplicationPath("resources")
public class RPALexisNexisApplication extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> classes = new HashSet<>();
		classes.add(RPALexisNexisServiceResource.class);
		return classes;	
	}
}