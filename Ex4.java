package pack;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x = s.nextDouble(),sum=0.0,nr=0.0;
        while (x!=-1){
            sum = sum + x;
            nr++;
            x = s.nextInt();
        }
        double m;
        m=sum/nr;
        System.out.println(m);

    }
}