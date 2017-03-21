package javabasics;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Ransom
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        Map<String, AtomicInteger> magazine = new HashMap<>();
        for (int magazine_i = 0; magazine_i < m; magazine_i++) {
            String magazineWord = in.next();
            magazine.putIfAbsent(magazineWord, new AtomicInteger(0));
            magazine.get(magazineWord).incrementAndGet();
        }

        for (int ransom_i = 0; ransom_i < n; ransom_i++) {
            String ransomWord = in.next();
            if (magazine.get(ransomWord) == null || magazine.get(ransomWord).get() == 0){
                System.out.println("No");
                return;
            } else {
                magazine.get(ransomWord).decrementAndGet();
            }
        }

        System.out.println("Yes");
    }
}
