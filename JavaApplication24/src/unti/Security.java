/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unti;

import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author DELL
 */
public class Security {
    private String password;

    public Security(String password) {
        this.password = password;
    }
    public static String enCryption(String password){
           try {
               String SECRET_KEY = "hlpa.";
            MessageDigest sha = MessageDigest.getInstance("SHA-1");
            byte[] key = password.getBytes("UTF-8");
            key = sha.digest(key);
            key = Arrays.copyOf(key, 16);
            SecretKeySpec secretKey = new SecretKeySpec(SECRET_KEY.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            return Base64.getEncoder().encodeToString(cipher.doFinal(password.getBytes("UTF-8")));
      } catch (Exception e) {
            System.out.println(e.toString());
      }
        return null;
        
    }
    public static String deCryption(String password){
           try {
               String SECRET_KEY = "hlpa.";
            MessageDigest sha = MessageDigest.getInstance("SHA-1");
            byte[] key = password.getBytes("UTF-8");
            key = sha.digest(key);
            key = Arrays.copyOf(key, 16);
            SecretKeySpec secretKey = new SecretKeySpec(SECRET_KEY.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            return new String(cipher.doFinal(Base64.getDecoder().decode(password)));
      } catch (Exception e) {
            System.out.println(e.toString());
      }
        return null;
        
    }
}
