package com.weyao.web.quote.util;

import org.apache.commons.codec.binary.Hex;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.util.Date;


public class Util {
    //项目ID：b390cf0c3d6e2455
    //AI：b390cf0c3d6e2455
    //公钥：1a947bb561c64932ac84ddf5b11e26e8
    //私钥：94398013bf3640f9971ab896c6feb148
    //token :0VeH72hf5wpD3MlMQ7Gdkf1JlJPpWE0bc6FqWFcPVsYmjPeBXG404wtEIdLnVOm2

    private static String PUBLIC  = "1a947bb561c64932ac84ddf5b11e26e8";
    private static String SECRET  = "94398013bf3640f9971ab896c6feb148";
    private static String PROJECT = "q9A5zp9W";
    private static String AI      = "b390cf0c3d6e2455";


    public static String authToken(String secret, String project, String ai, Long tm) throws Exception {
        String message = "POST\n/auth/token\nproject="+project+"&ai="+ai+"&tm="+tm;
        Mac hmac = Mac.getInstance("HmacSHA256");
        hmac.init(new SecretKeySpec(secret.getBytes("UTF-8"), "HmacSHA256"));
        byte[] signature = hmac.doFinal(message.getBytes("UTF-8"));
        return Hex.encodeHexString(signature);
    }

    public static void main(String args[]) throws Exception {

        Long tm = new Date().getTime();
        String auth = authToken(SECRET, PROJECT, AI, tm);

        System.out.println("tm=" + tm);
        System.out.println("auth=" + auth);
    }

}
