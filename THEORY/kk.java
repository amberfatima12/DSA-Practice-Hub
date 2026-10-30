package THEORY;
import java.util.Scanner;
import java.util.Scanner.*;
public class kk{
    public static void main(String[] args){
      int[] marks = {65,45,78,39,90};
for(int i = 0; i<marks.length; i++){
    if(marks[i]>=50){
    System.out.println("Student "+(i+1)+": Pass");}

else{
    System.out.println("Student "+(i+1)+": Fail");
}
}


// task 2
Scanner sc = new Scanner(System.in);
int pin;
for(int i = 0; i<5; i++){
    System.out.print("Enter pin code ");
    pin= sc.nextInt();
    if(pin==123){
        System.out.println("Welome ");break;
    }
    else{
        System.out.println("Incorrect pin ");
    }
}


// task 3
int temperature = 45;
if(temperature<15){
    System.out.println("very cold");
}
else if(temperature==15||temperature<30){
    System.out.println("Normal");
}
else if(temperature>31||temperature==40){
    System.out.println("Hot");
}
else if(temperature>40){
    System.out.println("very Hot");
}
else{
    System.out.println("wrong information");
}
    }
}
