import java.util.Scanner;

class peak_element{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=1;i<N-1;i++){
                if(arr[i-1] < arr[i] && arr[i]>arr[i+1])
                System.out.print(arr[i]);
                return;
        }
    }
}