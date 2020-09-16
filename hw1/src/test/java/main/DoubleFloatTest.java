package main;

import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.junit.Test;

public class DoubleFloatTest 
{
    
    @Test
    public void testSimple()
    {
        assertEquals(DoubleFloat.doubleFloat(4f), 8f, 0.00001f);
        assertEquals(DoubleFloat.doubleFloat(3.14f), 6.28f, 0.00001f);
        assertEquals(DoubleFloat.doubleFloat(100f), 200f, 0.00001f);
        assertEquals(DoubleFloat.doubleFloat(0f), 0f, 0.00001f);
    }


    @Test
    public void testRandom()
    {
        long seed = 12934144875758302l;
        Random random = new Random(seed);
        for (int i = 0; i < 1024; i++){
            float first = random.nextFloat();
            assertEquals(DoubleFloat.doubleFloat(first), first*2, 0.000000001f);
        }
        
    }
}
