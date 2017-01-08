package com.company;
import java.util.*;
/**
 * Created by fespa on 1/7/2017.
 */
public class Retail extends type {
    public static void Retail(){
        if(t==0){
            System.out.println("Congratulations, you get no discounts. Want a boot?");
            Scanner i = new Scanner(System.in);
            String in = i.next();
            if(in.equals("back")){
                x-=2;
            }
            if(!in.equals("no")){
                cost += 1000;
            }
        }
        if(t==1 || (t==2 && doubler == 1)){
            System.out.println("Congratulations, you get 20% off in the retail department. Want a boot?");
            Scanner i = new Scanner(System.in);
            String in = i.next();
            if(in.equals("back")){
                x-=2;
            }
            if(!in.equals("no")){
                cost += 800;
            }
        }
        if(t==2 && doubler==0){
            System.out.println("Congratulations, you get 10% off in the retail department. Want a boot?");
            Scanner i = new Scanner(System.in);
            String in = i.next();
            if(in.equals("back")){
                x-=2;
            }
            if(!in.equals("no")){
                cost += 900;
            }
        }
        x+= 2;
    }
}
