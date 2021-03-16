
package pack;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int x;
        for(x=0;x<=100;x++)
            if(prim(x))
                System.out.println(x);
    }
    public static boolean prim(int n){
        if(n<2 || n%2 == 0)
            return false;
        for(int i=3;i*i<=n;i+=2)
            if(n%i == 0)
                return false;
        return true;
    }
}