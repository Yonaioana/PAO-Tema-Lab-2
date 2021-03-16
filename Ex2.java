package pack;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        int z = s.nextInt();
        if(x<y)
            if(y<z)
                System.out.println("x<y<z");
            else if(x<z)
                System.out.println("x<z<y");
            else
                System.out.println("z<x<y");
        else if (x<z)
            System.out.println("y<x<z");
        else if (y<z)
            System.out.println("y<z<x");
        else
            System.out.println("z<y<x");
    }
}