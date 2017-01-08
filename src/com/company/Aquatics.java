package com.company;
import java.util.*;
/**
 * Created by fespa on 1/7/2017.
 */
public class Aquatics extends type{
    public static void Aquatics(){
        System.out.println("Do you want the Aquatics stuff?");
        Scanner aqua = new Scanner(System.in);
        String a = aqua.next();
        if(a.equals("back")){
            x -= 2;
        }
        if(!a.equals("no")){
            cost += 10 - (t-1) * 3;
        }
        x+= 2;
    }
}
