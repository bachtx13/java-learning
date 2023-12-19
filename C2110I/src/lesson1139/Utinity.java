/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson1139;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.java2d.pipe.SpanShapeRenderer;

/**
 *
 * @author admin
 */
public class Utinity {
    // lớp tiện tích
    public static String convertDateToString(Date datetime){
        SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
        return format.format(datetime);       
    }
    
    public static Date convertStringToDate(String str){
        SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
        try {
            return format.parse(str);
        } catch (ParseException ex) {
            Logger.getLogger(Utinity.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    };
}
