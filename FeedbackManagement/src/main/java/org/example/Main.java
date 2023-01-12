package org.example;

public class Main {
    public static void main(String[] args)
    {
        Feedback a= new Feedback();
        a.setFeedbackId(2);
        a.setFeedbackClientId(10);
        a.setFeedbackType("Positive");
        a.setFeedbackDescription("Excellent");

        User u=new User();
        u.setUserName("Anand");
        u.setUserId(41);
        u.setMobileNum(986532147);
        u.setEmailId("Anand@gmail.com");
        u.setAddress("Bangalore");

        Product p=new Product();
        p.setProductId(2549);
        p.setProductCusID(25);
        p.setProductNum(6593);
        p.setProductItem("Smart Phone");
        p.setProductDescription("Samsung Galaxy M04");

        System.out.println("UserName:"+u.getUserName());
        System.out.println("UserId:"+u.getUserId());
        System.out.println("User Mobile NUmber:"+u.getUserName());
        System.out.println("User EmailId:"+u.getEmailId());
        System.out.println("User Address:"+u.getAddress());
        System.out.println(" ");
        System.out.println("Product Id:"+p.getProductId());
        System.out.println("Product Number:"+p.getProductNum());
        System.out.println("Product CustomerId:"+p.getProductCusID());
        System.out.println("Product Item:"+p.getProductItem());
        System.out.println("Product Description:"+p.getProductDescription());


    }
}