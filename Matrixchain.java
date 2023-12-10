public class Matrixchain{
    public static int Mcm(int[] arr,int i,int j){
        if(i == j){
            return 0;
        }
        int  ans = Integer.MAX_VALUE;

        for(int k = i;k<=j-1;k++){
           int cost1 = Mcm(arr,i,k);
           int cost2 = Mcm(arr,k+1,j);
            int cost3 = arr[i-1] *arr[k] *arr[j];

            int finalcost = cost1 + cost2 + cost3;

            ans = Math.min(finalcost,ans);
        }
   return ans;
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,3};
        int n = arr.length;
        System.out.print(Mcm(arr,1,n-1));
    }
}