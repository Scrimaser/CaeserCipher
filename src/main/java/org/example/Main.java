package org.example;

public class Main {
    public static void main(String[] args) {
        Encoder encoder = new Encoder();
        String textEncrypt = encoder.encryptText("Шел медведь по лесу снов").toString();
        System.out.println(textEncrypt);
        String textDecrypt = encoder.decryptText(textEncrypt).toString();
        System.out.println(textDecrypt);


    }
}