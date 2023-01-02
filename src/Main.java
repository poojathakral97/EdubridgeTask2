import java.util.Scanner;
public class Main {
    static boolean checkperfect(int arr[], int n)
    {
        int i = 1;
        while (i < n && arr[i] > arr[i - 1])
            ++i;
        while (i < n && arr[i] == arr[i - 1])
            ++i;
        while (i < n && arr[i] < arr[i - 1])
            ++i;
        return (i == n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Elements : ");
        for(int i = 0 ;i<n;i++){
            arr[i] = sc.nextInt();
        }
        if (checkperfect(arr, n))
            System.out.println("Perfect Array");
        else
            System.out.println("Not Perfect Array");
    }
}