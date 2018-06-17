package com.starwar.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Util {
    public static String parseDate(String date)
    {

        SimpleDateFormat dateFormatParse = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'000Z'");
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd , yyyy HH:mm:ss");
        java.util.Date dDate = null;
        try {
            dDate = dateFormatParse.parse( date );
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if(dDate!=null)
            return  dateFormat.format( dDate );
        else
            return  date;

    }
}
