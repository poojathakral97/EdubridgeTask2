import java.util.Scanner;

public class perfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        double root = Math.sqrt(num);
        if((Math.floor(root) - root)==0)
            System.out.println(num+" is a Perfect Square Number");

        else
            System.out.println(num+" is Not a Perfect Square Number");
    }
}

