class K_shift_array{
    public static void main(String[] args){

        int k = 3;

        int arr[] = {1,2,3,4,5,6,7};
        int temp[] = new int[7];
        for(int i=0;i<arr.length;i++){
            temp[(i+k)%arr.length] = arr[i];
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(temp[i] + " ");
        }
    }
}