package org.example;

public interface CustomerLoginService {
    public  String authenticateCustomer(CustomerLoginDTO customerLogin) throws HnDBankException;
}
