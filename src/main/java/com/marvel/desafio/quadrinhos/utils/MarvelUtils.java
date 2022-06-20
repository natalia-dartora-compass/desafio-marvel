package com.marvel.desafio.quadrinhos.utils;

import org.springframework.util.DigestUtils;

import java.io.UnsupportedEncodingException;
import java.time.Clock;

public class MarvelUtils {

    public static final String PUBLIC_KEY = "57469304142f632d8fcae098c6aefab9";
    public static final String PRIVATE_KEY = "44745130c9933644752fae1ad1a86bb5250aeeed";

    private static Clock clock;

    public static String miliSegundos(){
        Clock horaAtual = clock.systemDefaultZone();
        return String.valueOf(horaAtual.millis());
    }

    public static String retornaHash(String milisegundos){
        String hash = milisegundos.concat(PRIVATE_KEY + PUBLIC_KEY);
        byte[] array2 = new byte[0];
        try {
            array2 = hash.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return DigestUtils.md5DigestAsHex(array2);
    }

}
