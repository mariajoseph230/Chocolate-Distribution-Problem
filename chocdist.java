import java.util.Scanner;
public class chocdist{
    static void choclatesort(int arr[],int m){
int n=arr.length;
int temp=0;
int m_diff=Integer.MAX_VALUE;
for(int i=0;i<n;i++){
 
 for(int j=1;j<n-i;j++){
    if(arr[j-1]>arr[j]){
        temp=arr[j-1];
        arr[j-1]=arr[j];
        arr[j]=temp;
}
}}
for(int i=0;i+m-1<n;i++){
    
    int diff = arr[i + m - 1] - arr[i];

if(diff<m_diff){
    m_diff=diff;
}
 }
 System.out.println(m_diff);
    
}
    public static void main(String args[]){
        int i,n,arr[],m;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter no. of packets:");
        n=in.nextInt();
        arr=new int[n];
        System.out.println("Enter those packets:");
        for(i=0;i<n;i++){
            arr[i]=in.nextInt();
             }
            System.out.println("Enter the no of children:");
            m=in.nextInt();
      choclatesort(arr,m);

          

    }
}
