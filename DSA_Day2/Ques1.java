public class Ques1{
    // public static void main(String[] args) {
    //     int[] arr={2,0,1,2,1,0,0,1,1};
    //     int one=0;
    //     int two=0;
    //     int zero=0;
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]==0)zero++;
    //         else if(arr[i]==1)one++;
    //         else if(arr[i]==2)two++;
    //     }
    //     int i=0;
    //     while(one!=0||two!=0||zero!=0){
    //         if(zero!=0){
    //             arr[i++]=0;
    //             zero--;
    //         }
    //         else if(one!=0){
    //             arr[i++]=1;
    //             one--;
    //         }
    //         else{
    //             arr[i++]=2;
    //             two--;
    //         }
    //     }
    //     for(int j:arr){
    //         System.out.print(j+" ");
    //     }

    // }

    public static void main(String[] args) {
       int[] arr={2,0,1,2,1,0,0,1,1};
       int first=0;
       int mid=0;
       int last=arr.length-1;
       while(mid<=last){
        if(arr[mid]==0){
            swap(first,mid,arr);
            first++;
            mid++;
        }
        else if(arr[mid]==1)mid++;
        else{
           swap(mid,last,arr);
           last--;
        }
       } 
            for(int j:arr){
            System.out.print(j+" ");
        }
    }
    public static void swap(int i,int j,int[] arr){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}