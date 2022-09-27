package Other.Interview;

import java.util.Scanner;

public class SecialString {
    public static void main(String[] args) {
        int c=0;
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String[] arr= new String[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextLine();
        }
        for (int i = 0; i < n; i++) {
            int k=0;
            int f=0;
            int f1=0;
            for (int j = 0; j < arr[i].length(); j++) {
                if(arr[i].charAt(j)!='a'){
                    f=1;
                    k=j;
                    break;
                }
            }
            for (int j = k; j < arr[i].length(); j++) {
                if(arr[i].charAt(j)!='b'){
                    f1=1;
                    break;
                }
            }

            if(f==1&&f1==0)
                c++;

        }

        System.out.println(c);
    }
}
