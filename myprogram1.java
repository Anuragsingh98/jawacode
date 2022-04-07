import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        char data = sc.next().charAt(0);
        if(data >='A' && data <='Z')
            System.out.println("1");
        else if(data >= 'A' && data<='Z')
            System.out.println('0');
        else
            System.out.println("-1");
    }
}