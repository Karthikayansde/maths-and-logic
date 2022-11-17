import java.util.Scanner;

public class PrimeAtOofSqrtOfn {
        public static void main(String[] arg) {
            Scanner scan = new Scanner(System.in);
            System.out.print("enter a no. to find a prime no : ");
            int n  = scan.nextInt(),count=0;
            for (int a = 1; a <= n; a++) {
                if(a==1){
                    System.out.println(a+" is not a prime no.");
                    continue;
                }
                count = 0;
                for (int i = 2; i <= Math.sqrt(a); i++) {
                    if(a%i==0){
                        count++;
                        break;
                    }
                }
                if(count == 0){
                    System.out.println(a+" is prime no.");
                }else{
                    System.out.println(a+" is not a prime no.");
                }
            }
        }
}
// int a = 0,i=1,b = 0,fa=0, arr[] =new int [100];
// Scanner scan = new Scanner(System.in);
// System.out.print("enter a value : ");
// a = scan.nextInt();
// for(i=1;i<=a;i++)
// {
//     if(a%i==0)
//     {
//         arr[fa]=i;
//         b++;
//         fa++;
//     }
// }
// int c  = b;
// b /= 2;
// for(int j =0;j<b;j++)
// {
//     if(c>b)
//     {
//         c--;
//         System.out.println(arr[j]+" X "+arr[c]+"  =  "+a);
//     }
// }