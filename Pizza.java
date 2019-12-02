import java.util.Scanner;

public class s1 {
    public static void main(String[] args)  
    {
        Scanner sc = new Scanner(System.in);
        int r= sc.nextInt();
        int x= sc.nextInt();
        float z=r-x;
        System.out.println((3.14159265358979323846 * z * z * 100) / (r * r *3.14159265358979323846)); //Calculate 
    }
}