package com.company;
import java.util.*;
/**
 * Created by fespa on 1/7/2017.
 */
public class mem extends type{
    public static void mem(){
        System.out.println("Want a membership?");
        Scanner meme = new Scanner(System.in);
        String meemee = meme.next();
        if(meemee.equals("back")){
            System.out.println("ok");
            x-=1;
        }
        else if(!meemee.equals("no")){
            System.out.println("How many months?");
            int h = meme.nextInt();
            cost += (Math.abs((t-2)*32) + 1) * h;
            if(t == 0)
                t= 1;
            if(t== 2)
                doubler = 1;
        }
    }
}
