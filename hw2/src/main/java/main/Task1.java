package main;

public class Task1 
{

    static boolean check(int num){
        return num % 7 == 0 && num % 5 != 0 && num % 9 != 0;
    }

    public static void main( String[] args )
    {
        int count = 0;
        for (int i = 100; i<1000; i++){
            if (check(i)){
                count ++;
            }
        }
        System.out.println( count );
    }
}
