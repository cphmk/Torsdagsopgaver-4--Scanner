// Task 2

// 2.c
import java.util.Scanner;

class Main {

// 2.a
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
// 2.b
        System.out.println("Please type your name");

// 2.d
        String name = scanner.nextLine();
        
// 2.e
        System.out.println("Hi, nice to meet you" + name);
        
        System.out.println("Please type your age");
  
// 2.f
        int age = scanner.nextInt();
  
// 2.g
        System.out.println("You are " + age + " years old");
        

// 2.h
        int ageOfRetirement = 67 - age;
        
        System.out.println("You may retire in " + ageOfRetirement + " years");
    }

}