package com.company;
import java.util.*;
/**
 * Created by fespa on 1/7/2017.
 */
public class type {
    public static int x = 0;
    public static int t = -1;
    public static int cost = 0;
    public static int doubler = 0;
    public static void type(){
        System.out.println("Are you a member or employee?");
        Scanner type = new Scanner(System.in);
        String tip = type.nextLine();
        if(tip.equals("no")){
            t = 0;
            mem.mem();
            x++;
        }
        if (tip.equals("member")) {
            t = 1;
            x++;
        }
        if (tip.equals("employee")){
            t = 2;
            mem.mem();
            x++;
        }
        x++;
    }
}
