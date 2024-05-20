Class Definition:
import java.util.*;: This imports the java.util package, which includes the Scanner class used for taking input.
public class two_sum: This defines a public class named two_sum.
Member Variables:
int num[] = new int[10];: This declares an array named num of size 10, which will store the 10 integers input by the user.
int t, i, j;: These are integer variables. t will store the target value, and i and j are used as loop counters.
Accept Method:
public void accept(): This is a method that takes user input.
Scanner sc = new Scanner(System.in);: This creates a Scanner object for reading input from the console.
System.out.println("Enter the array");: This prompts the user to enter 10 integers.
for (i = 0; i < 10; i++) { num[i] = sc.nextInt(); }: This loop iterates 10 times to read integers from the user and store them in the num array.
System.out.println("Enter the value of the target");: This prompts the user to enter the target value.
t = sc.nextInt();: This reads the target value and stores it in the variable t.
Check Method:
public void check(): This method checks for two numbers in the array that sum up to the target value.
int a = 0, b = 0, k = 0;: These variables are used to store the indices of the two numbers (a and b) and a flag (k) to indicate whether a pair has been found.
for (i = 0; i < 10; i++) { for (j = i + 1; j < 10; j++) { if ((num[i] + num[j]) == t) { k = 1; a = i; b = j; break; } } if (k == 1) break; }: This nested loop iterates over the array to find two numbers that add up to the target. The inner loop starts from i + 1 to avoid using the same element twice and to ensure unique pairs.
if ((num[i] + num[j]) == t) { k = 1; a = i; b = j; break; }: If a pair is found that adds up to the target, k is set to 1, and the indices are stored in a and b. The loop is then broken.
if (k == 1) break;: If a pair has been found, the outer loop is also broken.
if (k == 1) System.out.println(a + " " + b); else System.out.println("N/A");: If a pair has been found (k is 1), the indices are printed. If no pair is found, "N/A" is printed.
Main Method:
public static void main(String[] args): This is the main method where the program execution begins.
two_sum ob = new two_sum();: This creates an instance of the two_sum class.
ob.accept();: This calls the accept method to take user input.
ob.check();: This calls the check method to find and print the indices of the two numbers that add up to the target.
Summary
The program prompts the user to enter an array of 10 integers and a target value. It then finds two numbers in the array that add up to the target and prints their indices. If no such pair is found, it prints "N/A". The logic is implemented using nested loops and a flag to indicate whether a matching pair has been found.
