package net.abcbs.eae.jaxrs;
import java.util.ArrayList;
import java.util.*;
/***********************************************************************************************************************************************************************
 * @author mfribeiro
 * 
 * Description: RPALexisNexisDT class is used to manually test the web service call to retrieve values out of a data table
 * 
 * Project: Lexis Nexis LookUp Phone Number
 ***********************************************************************************************************************************************************************/
public class RPALexisNexisDT {
	
	public List<RPALexisNexisMessage> getDBServiceLines(){
		RPALexisNexisMessage servLn1 = new RPALexisNexisMessage("COVID19",1);
		RPALexisNexisMessage servLn2 = new RPALexisNexisMessage("ITS",2);
		RPALexisNexisMessage servLn3 = new RPALexisNexisMessage("N/A",3);
		
		List<RPALexisNexisMessage> serviceLinesLs = new ArrayList<>();
		serviceLinesLs.add(servLn1);
		serviceLinesLs.add(servLn2);
		serviceLinesLs.add(servLn3);
		return serviceLinesLs;
	}

}
