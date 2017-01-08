package com.company;
import java.util.*;
public class Main extends type{
    public static void main(String[] args) {
        while(x <= 4){
            if(x == 0){
                type();
            }
            else if(x == 1){
                classes.classes();
            }
           else if(x == 2)
                Retail.Retail();
            else if(x == 3 && t != 0){
                Aquatics.Aquatics();
            }
            else if (x == 3 && t == 0) {
                System.out.println("Want to go back?");
                Scanner h = new Scanner(System.in);
                String j = h.next();
                if(j.equals("yes"))
                    x-=2;
                x += 2;
            }
            else if(x == 4)
                train.train();
            x--;
        }
        System.out.println("Now please insert your credit card and say \"done\" when done.");
        Scanner done = new Scanner(System.in);
        while(!done.next().equals("done")){
            int y;
        }
        System.out.println("Thanks for paying. Your bill was $" + cost);
    }
}
