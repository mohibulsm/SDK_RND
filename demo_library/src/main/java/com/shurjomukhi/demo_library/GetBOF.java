package com.shurjomukhi.demo_library;

import java.util.Date;

public class GetBOF {

    public static String welcomeBOF(){

        return new Date().getDay()+"-"+new Date().getTime()+"/"+new Date().getDate();   //Thursday/12:23:/23-09-2019/
    }
}
