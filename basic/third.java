public class third {
    public static void main(String args[]){
        String a="hello";
        String b="welcome";
        String z=(1>2) ? a : b;
        System.out.println(z);
    }
    
}

//operators.. they make changes in the data
//1.arithmetic operators.. addition division modulo
//2.bitwise operators..
//  a)logical..operated on bits eg-and & , or | , xor ^
//  b) shift.. left shift, right shift
//  125 & 234.. convert to bits 125- 1111101 234- 11101010
// and  1&1=1, 1&0=0, 0&1=0, 0&0=0
// or   1&1=1, 1&0=1, 0&1=1, 0&0=0
// xor  1&1=0, 1&0=1, 0&1=1, 0&0=0
// left shift.. 245<<2 shift 245 left by 2 bits
// 01111'011' 3 bits left shift.. '011' is shifted to 3.. for left shift do 123/2^3=15.smtg remove decimal
// right shift.. 123>>3 shift 123 right by 3 bits.. do 245*2^2=980
// tertinary operator is replacement for if else.. condition?statement1:statement2
