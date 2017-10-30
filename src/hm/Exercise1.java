package hm;

public class Exercise1 {

    public static void main(String[] args){
        System.out.println(fractionSum(5));
    }
    
    public static double fractionSum(int n){
        double value = 0;
        for(int i = 1; i <= n; i++){
            value += 1.0/i;
        }
        return value;
    }
}
