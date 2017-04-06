package javabasics;

import java.util.OptionalLong;
import java.util.Scanner;
import java.util.stream.LongStream;

public class PrimeAnother
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        for(int a0 = 0; a0 < p; a0++){
            int n = in.nextInt();
            if(isPrime(n)){
                System.out.println("Prime");
            }else{
                System.out.println("Not prime");
            }
        }
    }

    private static boolean isPrime(int i)
    {
        if(i == 1){
            return false;
        }

        if (i == 2 || i == 3) {
            return true;
        }

        OptionalLong first = LongStream.range(2, (long) Math.sqrt(i) + 1).filter(v -> i % v == 0).findFirst();

        return !first.isPresent();
    }

}
