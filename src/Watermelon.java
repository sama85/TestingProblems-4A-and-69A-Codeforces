public class Watermelon {

    public String canDivide(int w){
        if(w >= 1 && w <= 100) {
            if (w > 2 && w % 2 == 0) return "YES";
            return "NO";
        }
        return "Weight out of bounds";
    }

}
