package com.twdollarbills.mayoonspringboot.testClass;


import java.io.*;
import java.util.*;

public class Needle {
    public static int count(String needle, InputStream haystack) throws Exception {
        int res = 0;
        try {

            StringBuffer sb = new StringBuffer();
            byte[] b = new byte[4096];
            for(int n; (n= haystack.read(b)) != -1;)
            {
             sb.append(new String(b,0,n));
            }
            String[] inputStr = sb.toString().split("\n");
            for(int j=0; j<inputStr.length; j++){
                System.out.println(inputStr);
                if( (inputStr[j].substring(  inputStr[j].length()-needle.length()-1, inputStr[j].length()-1 ).equals(needle) )) res++;
            }

        }catch (Exception e){
            throw new UnsupportedOperationException("Waiting to be implemented.");
        }
        return res;
    }

    public static void main(String[] args) throws Exception {
        String inMessage = "Hello, there!\nHow are you today?\nYes, you over there.";

        try(InputStream inStream = new ByteArrayInputStream(inMessage.getBytes())) {
            System.out.println(Needle.count("there", inStream));
        }
    }
}
