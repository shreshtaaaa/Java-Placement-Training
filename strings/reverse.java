//reverse string
//hello vinay
//yaniv olleh

import java.util.Scanner;

class reverse{
    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        
        char[] chars = str.toCharArray();
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        System.out.println(new String(chars)); //new String(chars).. dont write only chars cuz it has to return the whole string
    }
}