package javacode;

public class Problem3 {

    public static void main(String[] args) {
        int a = 6; 

        int limit;

        if (a % 2 == 0) {  
            limit = a - 1; 
        } else {
            limit = a;     
        }

        int num = 1;

        while (num <= limit) {
            System.out.print(num + " ");
            num = num + 2;
        }
    }
}

