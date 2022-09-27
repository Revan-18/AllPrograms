package leetcode;

import java.util.Arrays;
import java.util.List;

public class RotateArray {
    public static void main(String[] args) {
        int n=7,k=3;
        int[] a1={1,2,3,4,5,6,7};
        int[] a2=new int[7];
        k=k%n;    //very imp step
        int temp=n-k;


        for (int i = 0; i < n; i++) {
            a2[i]=a1[(i+temp)%n];
        }
        System.arraycopy(a2,0,a1,0,n);

        }

    }

