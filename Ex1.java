package pack;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=5;i<=n;i=i+10)
        {
            System.out.println(i);
        }
    }
}