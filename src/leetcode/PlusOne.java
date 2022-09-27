package leetcode;

import java.text.DecimalFormat;

public class PlusOne {
    //{1,2,3,9}
    public static int[] plusOne(int[] digits) {
        int n=digits.length;
        double sum=0;
        int j=n-1;
        if(digits[n-1]==9)
        {

            for (int i:digits) {
                sum=sum+(i*Math.pow(10,j--));
            }
            sum+=1;
            DecimalFormat df = new DecimalFormat("#");
            df.setMaximumFractionDigits(0);
            String format = df.format(sum);
            int[] output=new int[format.length()];
            for (int i = output.length-1; i >=0 ; i--) {
                output[i]=format.charAt(i)-'0';
            }
            return output;
        }
        else {
            digits[n-1]+=1;
        }
        return digits;

    }

    public static void main(String[] args) {
        int[] array={9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9};
        for(int i: plusOne(array)){
            System.out.print(i);
        }
    }

}
