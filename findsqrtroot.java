import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        System.out.print("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("the squareroot of"+ n+ "is:"+squareroot(n));
        
        
    }
    public static double squareroot(int num){
        double t;
        double sqrtroot = num/2;
        do
        {
        
        t= sqrtroot;
        sqrtroot = (t+(num/t))/2;
        
    }
    while((t-sqrtroot)!=0);
    return sqrtroot;
    
}
}
