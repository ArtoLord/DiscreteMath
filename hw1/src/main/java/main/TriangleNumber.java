package main;

class TriangleNumber{

    /**
     * Проверка, имеент ли триугольное число не меньше 500 делителей
     * @param triangle триугольное число, которое нужно проверить
     * @param num номер триугольного числа
     */
    static boolean checkTriangle(final int triangle, final int num) {
        int number_of_devidors = 0; 

        for (int i = 1; i <= num + 1; i++) {
            if (triangle % i == 0) {
                number_of_devidors ++;
                if (triangle / i > num + 1){
                    number_of_devidors ++;
                }
            }
        }

        return number_of_devidors >= 500;
    }

    public static void main(final String[] args) {
        int curr = 1; //Номер триугольного числа

        //triangle == curr*(curr+1)/2, так как это сумма последовательных целых чисел
        
        while( !checkTriangle(curr*(curr+1)/2, curr, false)){
            curr +=1;
        }
        System.out.println(curr*(curr+1)/2);

    }
}
