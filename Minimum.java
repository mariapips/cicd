package work.Minimum;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Minimum {
    public static int  getMinimum(int a,int b,int c){
        int min;
        if ((a < b) && (a < c) )
        min = a;
        else if ((b < a) && (b < c))
        min = b;
    else
        min = c;
        return (min);
    }
    public static void main (String[] args) throws IOException {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader obj1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader obj2 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter an integer: ");
        int a = Integer.parseInt(obj.readLine());
        int b = Integer.parseInt(obj1.readLine());
        int c = Integer.parseInt(obj2.readLine());
        int result = getMinimum(a, b, c);
        System.out.println(result);
    }


}
