package loginuser;

import java.util.Scanner;

public class loginuser {
   public static void main(String[] args) {
	   String correctUserName ="Isaac";
	   int correctPassword = 123456;
	 Scanner scanner = new Scanner(System.in);
	 
	 for(int i=0; i<3; i++) 
	 {System.out.print("Enter username:");
		
     String userName = scanner.nextLine();
     System.out.print("Enter password:");
     int password = scanner.nextInt();// consume newline character
     scanner.nextLine();
     
      if (userName.equals(correctUserName) && password == correctPassword) {
    	 System.out.println("login successful");
    	 break;
     } else {
    	 System.out.println("invalid login.");
    	 if (i==3) {
    		 System.out.println("try again");
    	          }
            }
        }
   }
}
