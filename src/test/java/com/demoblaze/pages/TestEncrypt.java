package com.demoblaze.pages;

import com.demoblaze.utilities.EncryptionUtils;

public class TestEncrypt {
    public static void main(String[] args) {

        String username=EncryptionUtils.encrypt("blg","Eurotech123");
        System.out.println("username = " + username);

        String password=EncryptionUtils.encrypt("Test1234!","Eurotech123");
        System.out.println("password = " + password);

//        login.step deki cripto metodu sayesinde burasi olmasa bile giris yapilabiliryor.

//        String secretKey=System.getenv("MySecretKey");
//        System.out.println("secretKey = " + secretKey);
////        yukarida gibi yaparsak 8.satir asagidaki gibi yapilmis olur.
//        String username2=EncryptionUtils.encrypt("blg",System.getenv("secretKey"));
//        System.out.println("username = " + username);


    }
}
