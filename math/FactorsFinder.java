import java.util.Scanner;

public class FactorsFinder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter a no. to find a factor : ");
        int n = scan.nextInt(),i = 1,t = n/2,j = t;
        for(i = 1;i<j;i++){
            if(n%i == 0){
                if(i == 1){
                    System.out.println(i+" * "+n+" = "+n);
                    continue;
                }else{
                    System.out.print(i+" * ");
                    for(j = t;j>i;j--){
                        if(n%j == 0){
                            System.out.println(j+" = "+n);
                            t = j;
                            t--;
                            break;
                        }
                    }
                }
            }
        }
    }
}