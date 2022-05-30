import org.junit.Test;

import static org.junit.Assert.*;

public class WatermelonTest {

    @Test
    public void test1(){
        Watermelon w = new Watermelon();
        assertEquals("YES", w.canDivide(4));
    }

    @Test
    public void test2(){
        Watermelon w = new Watermelon();
        assertEquals("NO", w.canDivide(5));
    }

    @Test
    public void test3(){
        Watermelon w = new Watermelon();
        assertEquals("NO", w.canDivide(1));
    }

    @Test
    public void test4(){
        Watermelon w = new Watermelon();
        assertEquals("YES", w.canDivide(100));
    }

    @Test
    public void test5(){
        Watermelon w = new Watermelon();
        assertEquals("Weight out of bounds",  w.canDivide(105));
    }

    @Test
    public void test6(){
        Watermelon w = new Watermelon();
        assertEquals("Weight out of bounds", -50);
    }



}