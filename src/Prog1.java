
public class Prog1 {

    public static void reverse(int num){
        if(num < 10){
            System.out.print(num);
        }
        else{
           System.out.print(num % 10);
           reverse(num / 10);
        }
    }

    public static void main(String[]args){
        reverse(123);

    }

}
