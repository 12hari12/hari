Given an array of size N, it contains all the numbers from 1 to N+1 inclusive, except one number. You have to find the missing number.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines, first line of each test case contains N - size of the array and the next line contains N integers - the elements of the array.

Constraints

1 <= T <= 500
1 <= N <= 10000
1 <= ar[i] <= N+1

Output Format

For each test case, print the missing number, separated by newline.

Sample Input 0

3
8
1 2 7 9 5 6 3 8 
7
3 5 8 1 4 7 2 
10
8 11 10 2 7 4 3 5 1 6 
Sample Output 0

4
6
9
Explanation 0

Test Case 1:
Array Size=8: It should have all the elements between [1,9] exactly once, except one of them. Hence 4 is the missing element.

Test Case 2:
Array Size=7: It should have all the elements between [1,8] exactly once, except one of them. Hence 6 is the missing element.

Submissions: 11128
Max Score: 50
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
          
8
            
9
            Scanner cs=new Scanner(System.in);
10
            int t=cs.nextInt();
11
            int sum=0;
12
            int sam=0;
13
           while(t>0){
14
                   sum=0;
15
                   sam=0;
16
                    int n=cs.nextInt();
17
                    int a[]=new int[n];
18
                    for(int j=0;j<a.length;j++){
19
                            a[j]=cs.nextInt();
20
                            
21
                    }
22
                   for(int i=1;i<=n+1;i++){
23
                           sum+=i;
24
                   }
25
                    
26
                   for(int i=0;i<n;i++){
27
                           sam+=a[i];
28
                   }
29
            System.out.println(sum-sam);
30
            t--;
31
                   
32
                   
33
           }
34
    }
35
}
