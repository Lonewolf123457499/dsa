package ALGO;
// stock buy and sell problem
public class stock_buy
{
    public static int stock_buy(int arr[])
    {
        int minsofar=arr[0];
        int maxprofit=0;
        for(int i=0;i<arr.length;i++)
        {
            minsofar=Math.min(minsofar,arr[i]);
            int profit=arr[i]-minsofar;
            maxprofit=Math.max(maxprofit,profit);
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int arr[]={3,5,1,7,4,9,3};
        System.out.println(stock_buy(arr));
    }

}
