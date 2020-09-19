package main;

public class DoubleFloat {

    /**
     * Удваивает number
     * @param number
     * @return number * 2
     */
    public static float doubleFloat(float number){
        
        int bin = Float.floatToIntBits(number);
        int e = (bin & ((1 << 31) - 1)) >> 23; //Порядок числа number
        e += 1; //Увеличиваем порядок на 1, то есть умножаем число на 2
        bin = bin & ((1 << 31) | ((1 << 23) - 1)); // Обнуляем порядок number
        bin = bin | (e << 23); //Возвращаем порядок на место
        number = Float.intBitsToFloat(bin);
        return number;
    }

    public static void main(String[] args){
        System.out.println(doubleFloat(1f));
    }
    
}
