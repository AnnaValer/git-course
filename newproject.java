import java.util.Scanner;
public class newproject {
	public static void main(String[] args)  {
       Scanner sc = new Scanner(System.in);
       String x = sc.nextLine(), y = sc.nextLine();
       if(x.equals(y) == false){
         System.out.print("Access is granted");  
       } else{
       System.out.print("Access is denied");
       }
   }
    
}
