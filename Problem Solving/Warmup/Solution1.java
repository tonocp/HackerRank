package ProblemSolving.Warmup;

import java.util.*;

/*Complete the function solveMeFirst to compute the sum of two integers.

Example


Return .

Function Description

Complete the solveMeFirst function in the editor below.

solveMeFirst has the following parameters:

int a: the first value
int b: the second value
Returns
- int: the sum of  and 

Constraints


Sample Input

a = 2
b = 3
Sample Output

5
Explanation

.*/

public class Solution1 {



    static int solveMeFirst(int a, int b) {
      // Hint: Type return a+b; below
      return a+b;
	}

 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
        sum = solveMeFirst(a, b);
        System.out.println(sum);
	}
}