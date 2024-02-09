package lk.mobitel.esms;

import lk.mobitel.esms.test.ServiceTest;
import wsdl.User;

/**
 * @author danushka
 * 2024-02-09
 */
public class ESMS {
    public static void main(String[] args) {
        User user = new User();
        user.setUsername("YOUR_USERNAME");
        user.setPassword("YOUR_PASSWORD");

        ServiceTest test = new ServiceTest();
        System.out.println(test.testService(user));
    }
}
