import java.util.*;
public class HeadTail{
    public static void main(String[] args){
        cointoss();
    }

    static void cointoss(){
        int h=0, t=0; 
        Random rand = new Random();
        System.out.println("Tossing a coin...");
        for(int i=1; i<=3; i++){
            int r = rand.nextInt(2);
            System.out.print("Round " + i + ": ");
            if(r == 0){ 
                System.out.println("Heads");  
                h++;
            } else {
                System.out.println("Tails");
                t++;
            }
        }
        System.out.printf("Heads: %d, Tails: %d\n",h,t);
    } 
}