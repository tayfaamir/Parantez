import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Paran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String in0put = scanner.next();
        Stack<Integer> indexes = new Stack<>();

        StringBuilder input= new StringBuilder(in0put);

        for (int i = 0; i <input.length(); i++) {
            if (input.charAt(i) == '(') {
                indexes.add(i);
            }
        }
        long mark =0;
        long moves = 0;
        int x = 0;
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i)=='('){
                x++;
                mark++;
            }
            if(input.charAt(i)==')'){
                mark--;
            }
            if(mark<0){
                char w = input.charAt(i);
                moves = moves + indexes.get(x)-i;
                input.setCharAt(i,input.charAt(indexes.get(x)));
                input.setCharAt(indexes.get(x),w);
                x++;
                mark=1;
            }
        }
        System.out.println(moves);
    }
}
