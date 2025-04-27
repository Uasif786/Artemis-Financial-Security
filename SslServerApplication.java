package com.snhu.sslserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@SpringBootApplication
@RestController
public class SslServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SslServerApplication.class, args);
    }

    @GetMapping("/hash")
    public String getCheckSum() throws NoSuchAlgorithmException {
        String data = "Hello World Check Sum! - Created by Umar Asif"; 
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        
        md.update(data.getBytes());
        byte[] digest = md.digest();
        
        // Convert the byte array to a hex string
        StringBuilder hexString = new StringBuilder();
        for (byte b : digest) {
            hexString.append(String.format("%02x", b));
        }
        
        return "<p>data: " + data + "</p>" +
               "<p>SHA-256 checksum: " + hexString.toString() + "</p>";
    }
}