package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) throws Exception {
        InetAddress localhost = InetAddress.getLocalHost();
        System.out.println("IP address is = "+(localhost.getHostAddress()).trim());

        String systemipaddress = "";
        try {
            URL url = new URL("http://bot.whatismyipaddress.com/");
            BufferedReader obj = new BufferedReader(new InputStreamReader(url.openStream()));
            systemipaddress = obj.readLine().trim();
        }catch (Exception e){
            systemipaddress = "Error occured";
        }
        System.out.println("IP address is "+systemipaddress);
    }
}