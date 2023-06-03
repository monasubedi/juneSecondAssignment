public class Prog2 {
    public static int count(int num){
        if(num <= 9){
            return 1;
        }
        else{
            return(1 + count(num / 10));
        }
    }

    public static void main(String[]args){
        int answer = count(6536);
        System.out.println("answer is " + answer);
    }

}
