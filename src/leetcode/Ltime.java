package leetcode;
import java.util.*;
import java.lang.*;


/* Name of the class has to be "Main" only if the class is public. */
class Ltime
{
    public static void main (String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int Z = sc.nextInt();
        String[] arr = new String[Z];
        for(int i=0;i<Z;i++){
            int f=sc.nextInt();
            if(f<=4 && f>=1){
                arr[i]="YES";
            }
            else arr[i] = "NO";
        }
        for(int i=0;i<Z;i++){
            System.out.println(arr[i]);
        }

    }
}

