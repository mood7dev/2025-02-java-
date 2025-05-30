package ch05.sec11;

import java.util.Arrays;
import java.util.Enumeration;

public class Mission01 {
    public static void main(String[] args) {

        int sum = 0;
        for(int i = 0; i < args.length; i++){
            int num = Integer.parseInt(args[i]);
            sum += num;

        }
        System.out.println(Arrays.toString(args));
        System.out.println(sum);
    }
}
