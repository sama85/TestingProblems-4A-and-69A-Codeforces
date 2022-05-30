import java.util.*;

public class Forces {

    public String checkEquilibrium(int n, int[][] forces){
        if(n < 1 || n > 100) return "Number of forces out of bounds";

        int sumx = 0, sumy = 0, sumz = 0;
        for(int i = 0; i < n; ++i){
            sumx += forces[i][0];
            sumy += forces[i][1];
            sumz += forces[i][2];
            for(int j = 0; j < 3; ++j) {
                if (forces[i][j] < -100 || forces[i][j] > 100)
                    return "Force magnitude out of bounds";
            }
        }
        if(sumx == 0 && sumy == 0 && sumz == 0) return "YES";
        return "NO";
    }

}
