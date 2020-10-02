package main;

import java.util.ArrayList;

public class Task2 {

    /**
     * Считает строку триугольника паскаля под номером line_number
     * @param line_number номер строки триугольника
     * @return
     */
    private static ArrayList<Integer> paskalTriangle(int line_number){
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1); // Первая строка треугольника
        for (int i = 1; i < line_number + 1; i++){
            a.add(0, 0); // Добавляем нули для удобства счета, чтобы не нужно было рассматривать крайнии случаи
            a.add(0);
            ArrayList<Integer> b = new ArrayList<Integer>();
            for (int f = 0, s = 1; f < a.size() - 1 && s < a.size(); f++, s ++){ // Разбиваем весь список на два, сдвинутых на 1
                b.add(a.get(f)+a.get(s)); // Составляем следующую строку
            }
            a = b; // Переходим к следующей строке, копируя ссылку за O(1)
        }
        return a;
    }

    public static void main(String[] args){
        ArrayList<Integer> paskal = paskalTriangle(20);
        int m = 0, max_i = -1;
        for (int i = 0; i < paskal.size(); i++) { // Рассматриваем все числа и ищем максимум
            if ((1 << i) * paskal.get(i) > m){
                m = (1 << i) * paskal.get(i);
                max_i = i;
            }
        }
        System.out.println(m);
        System.out.println(max_i);
    }
    
}
