
import java.util.Scanner;
public class pr{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,index = 0;
        System.out.print("How many number you want to enter?");
        int s = sc.nextInt(); 
        int [] number = new int[s]; 
        int [] count = new int[s];
        
        System.out.println("Enter the numbers");
        for(i=0; i < s; i++){
            number[i] = sc.nextInt();
        }
     
    
        for(i = 0; i < number.length; i++){
                index = number[i];
                count[index]++;
            }

        for(i=1; i < count.length; i++){

            if(count[i] > 0){
             System.out.printf("%d occurs %d time\n",i, count[i]);
             }


         }
    }
}