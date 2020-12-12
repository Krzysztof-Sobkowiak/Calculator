package com.kodilla.testing;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();
        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }


        Calculator calculator = new Calculator();
        int add = calculator.addAToB(7, 5);
        int substract = calculator.substractAFromB(15,5);

        if(add == 12) {
            System.out.println("Result calculator adding test: OK");
        }
        else {
            System.out.println("Error");
        }
        if(substract == 10) {
            System.out.println("Result calculator substract test: OK");
        }
        else {
            System.out.println("Error");
        }
    }
}
