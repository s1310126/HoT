import java.util.*;
public class HeadTail{
    public static void main(String[] args){
        int result;
        String name = greet();
        result = cointoss();
        if(result == 1) System.out.println(name + " won!");
        else System.out.println(name + " lost.");
    }

    static String greet(){
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Who are you?");
        name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        return name;
    } 

    static int cointoss(){
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
        if(h > t) return 1;
        return 0;
    } 
}