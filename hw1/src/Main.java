
class Main{
    static boolean check_triangle(int triangle, int num){
        int number_of_devidors = 1;
        for (int i = 1; i < num + 1; i++){
            if (triangle % i == 0){
                number_of_devidors += 1;
            }
        }
        return number_of_devidors >= 500;
    }

    public static void main(String[] args){
        int curr = 1;
        while( !check_triangle(curr*(curr+1)/2, curr)){
            curr +=1;
        }
        System.out.println(curr*(curr+1)/2);
    }
}