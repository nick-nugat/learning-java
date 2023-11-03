package codewars;

 
public class Paper {
    /**
     * 
     * @param n classmates
     * @param m pages
     * @return
     */
    public static int paperWork(int n, int m){
        if (n < 0 || m < 0) return 0;
        return n * m;
    
    }
}