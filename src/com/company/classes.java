package com.company;

import java.util.Scanner;

/**
 * Created by fespa on 1/7/2017.
 */
public class classes extends type {
    public static void classes(){
        System.out.println("Want classes?");
        Scanner clas = new Scanner(System.in);
        String cla = clas.next();
        if(cla.equals("back")) {
            System.out.println("ok");
            x -= 2;
        }
        else if(!cla.equals("no")){
            if(t==0)
            cost += 10;
            if(t==1)
                cost += 8;
            if(t==2)
                cost+= 3;
        }
        x += 2;
    }
}
