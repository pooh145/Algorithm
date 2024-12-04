package Grade;

import java.util.Scanner;

public class grade {
    
public static void main(String[]args){
    Scanner scanIn = new Scanner(System.in);
    System.out.print("score");
    int score = scanIn.nextInt();

    String grade;
    if(score>=80){
      grade = "A";
}         
else if (score >= 75){
    grade = "B+";
}
else if (score >= 70){
  grade= "B";
}
else if (score>= 65){
  grade = "c+";       
}
else if (score>= 60){
  grade = "c";
}
else if (score >= 55){
  grade = "D+";
}
else if (score >= 50){
  grade = "D";
}
else {
     grade = "F";
    
 }   
   System.out.println(grade);
   scanIn.close();
 }
}
