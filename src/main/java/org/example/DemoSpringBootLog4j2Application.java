package org.example;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class DemoSpringBootLog4j2Application implements CommandLineRunner {
    private static final Log LOGGER = LogFactory.getLog(DemoSpringBootLog4j2Application.class);
    @Autowired
    CustomerLoginController customerLoginController;
    @Autowired
    Environment environment;

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringBootLog4j2Application.class, args);
        }
    public void run(String... args) throws Exception {
        // TODO Auto-generated method stub
       System.out.println("-------------");
        try{
            CustomerLoginDTO customerLogin = new CustomerLoginDTO();
            customerLogin.setLoginName("vishnu");
            customerLogin.setPassword("vishnu378");
            customerLoginController.authenticateCustomer(customerLogin);
            System.out.println("customerLogin = " + customerLogin);
            LOGGER.info(environment.getProperty("SUCCESS"));
            System.out.println("----*---");
        }catch(HnDBankException exception){
            System.out.println("----**---");
            LOGGER.error(environment.getProperty(exception.getMessage()));
            System.out.println("----***---");
        }
    }
}
