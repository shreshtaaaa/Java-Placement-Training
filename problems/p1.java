//minimum no of platfrom problem
//arr=[7:00,7:30,6:40,7:15,8:05,8:20]
//dept=[7:05,6:30,6:40,7:35,8:15,7:20]
//sort it
//sort arr=[6:40,7:00,7:15,7:30,8:05,8:20]
//sort dep=[6:30,6:40,7:05,7:20,7:35,8:15]

//arr       dept        no of trains waiting
//6:40      6:30        1
//7:00      6:40        1
//7:15      7:05        1
//7:30      7:20        1
//8:05      7:35        1
//8:20      8:15        1

//no of minimum platforms=no of maximum trains waiting

public class p1{
    public static void main(String[] args) {
        double[] arr={7.0,7.15,7.45,8.10,8.15,9.0,9.05,9.25};
        int max=0;
        double[] dept={7.05,7.50,7.55,8.39,8.55,9.40,9.35,9.30};
        int count=1;
        for(int i=0;i<arr.length;i++){
            for(int j=i-1;j>=0;j--){
                if(dept[j]<arr[i])
                break;
                else
                count++;
            }
            if(count>max){
                max=count;
                count=1;
            }
            System.out.println("min platform rew:"+max);

        }
    }
}