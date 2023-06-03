public class Prog3 {
    public static int sum(int [] a, int n){
        if(n <= 0){
            return 0;
        }
        else{
            return sum(a,n-1) + a[n-1];
        }
    }

    public static void main(String[]args){
        int answer = sum(new int[]{1,2,3,4},4);

        System.out.println("sum is " + answer);
    }
}
