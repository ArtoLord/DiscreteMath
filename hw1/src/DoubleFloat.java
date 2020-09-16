
public class DoubleFloat {

    static float doubleFloat(float number){
        
        int bin = Float.floatToIntBits(number);
        int e = (bin & ((1 << 31) - 1)) >> 23;
        e += 1;
        System.out.println(e);
        bin = bin & ((1 << 31) | ((1 << 23) - 1));
        bin = bin | (e << 23);
        number = Float.intBitsToFloat(bin);
        return number;
    }

    public static void main(String[] args){
        System.out.println(doubleFloat(1f));
    }
    
}
