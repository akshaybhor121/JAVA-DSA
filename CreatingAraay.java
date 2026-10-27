import java.util.Scanner;

public class CreatingAraay 
{
    public static void main(String [] args)
    {
        // int arr[] = {10,20,30,40,50};
        // for(int i = 0; i<arr.length;i++)
        // {
        //     System.out.print(arr[i]+" ");
        // }

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter Array element :");
        for(int i = 0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
         for(int i = 0;i<arr.length;i++)
        {
           System.out.print(arr[i]+" ");
        }

    }
    
}
