Print hollow rectangle pattern using '*'. See example for more details.

Input Format

Input contains two integers W - width of the rectangle and L - length of the rectangle.

Constraints

2 <= W <= 50
2 <= L <= 50

Output Format

For the given integers W and L, print the hollow rectangle pattern.

Sample Input 0

5 4
Sample Output 0

*****
*   *
*   *
*****
Explanation 0

Self Explanatory

Submissions: 12880
Max Score: 20
Difficulty: Easy
Rate This Challenge:

    
More
 
1
import java.io.*;
2
import java.util.*;
3
​
4
public class Solution {
5
​
6
    public static void main(String[] args) {
7
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
8
        Scanner sc=new Scanner(System.in);
9
        int a=sc.nextInt();
10
        int b=sc.nextInt();
11
        for(int i=1;i<=b;i++){
12
            for(int j=1;j<=a;j++){
13
                if((j==1 || j==a) || (i==1 || i==b) ){
14
                    System.out.print("*");
15
                }
16
                else{
17
                    System.out.print(" ");
18
                }
19
            }
20
            System.out.println();
21
        }
22
    }
23
}
