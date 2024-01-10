import java.util.Scanner;
public class Five{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // String car= sc.next();  <-- this is for one word .next
        String car= sc.nextLine();  
        // this is for entire sentence
        System.out.println(car);
        System.out.print("Enter a number: ");
        int num= sc.nextInt();
        System.out.println(num);


    }
}