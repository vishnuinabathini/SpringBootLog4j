package org.example;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository(value="customerLoginRepository")
public class CustomerLoginRepositoryImpl implements CustomerLoginRepository {
    @Override
    public CustomerLoginDTO getCustomerLoginByLoginName(String loginName) {
        Map<String,String> customerCredentials=new HashMap<String, String>();
        customerCredentials.put("vishnu","vishnu3789");
        customerCredentials.put("triveni","triveni3789");
        customerCredentials.put("sri","sri3789");
        customerCredentials.put("saanvitha","saanvitha3789");
        CustomerLoginDTO customerLogin=new CustomerLoginDTO();
        customerLogin.setLoginName(loginName);
        customerLogin.setPassword(customerCredentials.get(loginName));
        return customerLogin;
    }
}
