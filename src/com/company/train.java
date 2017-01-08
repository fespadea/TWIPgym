package com.company;
import java.util.*;
/**
 * Created by fespa on 1/7/2017.
 */
public class train extends type{
    public static void train(){
        System.out.println("Do you want a personal trainer?");
        Scanner tra = new Scanner(System.in);
        String tranny = tra.next();
        if(tranny.equals("back")){
            x-=2;
        }
        else if(!tranny.equals("no")){
            System.out.println("How many hours?");
            int h = tra.nextInt();
            cost += (25 - t * 5) * h;
        }
        x+=2;
    }
}
