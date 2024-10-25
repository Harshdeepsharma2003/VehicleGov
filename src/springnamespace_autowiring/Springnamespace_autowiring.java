
package springnamespace_autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spr.dto.Vehicle;

public class Springnamespace_autowiring {

  
public static void main(String[] args) {
ApplicationContext context=new ClassPathXmlApplicationContext("/SpringXMLConfig.xml");//load spring xml file load

Vehicle obj=(Vehicle)context.getBean("Harshdeep");
System.out.println(obj);

//Vehicle obj=(Vehicle)context.getBean("Harshdeep");
//System.out.println(obj.getvNo()+" "+obj.getState()+" "+obj.getOwnerName()+" "+obj.getFuelCategory());
    }
    
}
