import org.junit.Test;

import static org.junit.Assert.*;

public class ForcesTest {

    @Test
    public void test1(){
        Forces f = new Forces();
        int forces [][] = {{10, 3, 6} , {-5, -2, -4}, {-5, -1, -2}};
        assertEquals("YES", f.checkEquilibrium(3, forces));
    }

    @Test
    public void test2(){
        Forces f = new Forces();
        int forces [][] = {{7, 3, 6} , {-5, -2, -4}, {-5, -1, -2}};
        assertEquals("NO", f.checkEquilibrium(3, forces));
    }

    @Test
    public void test3(){
        Forces f = new Forces();
        int forces [][] = {};
        assertEquals("Number of forces out of bounds", f.checkEquilibrium(0, forces));
    }

    @Test
    public void test4(){
        Forces f = new Forces();
        int forces [][] = {{-200,1,1}, {200,-1,-1}};
        assertEquals("Force magnitude out of bounds", f.checkEquilibrium(2, forces));
    }

}