import java.util.Scanner;
public class butterfly {
    public static void main(String argfs[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            int space=2*(n-i);
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //lower half
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            int space=2*(n-i);
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    
}
