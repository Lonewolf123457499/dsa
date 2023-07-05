package hackerrank_solution;

//import org.jetbrains.annotations.NotNull;

public class elevtronic_shop
{
    public static int electronic(int a[], int b[], int budget)
    {
        boolean flag=false;
        int min=0;
        int sum=0;
        for(int i=0;i<=a.length-1;i++) {
            for (int j = 0; j <= b.length - 1; j++) {
                sum = a[i] + b[j];

                if (sum < budget) {
                    if (sum > min) {
                        min = sum;
                        flag=true;
                    }
                }
            }
        }
        if(flag==true)
            return min;
        else
            return -1;
    }

    public static void main(String[] args) {
        int a[]={30,40,50,60};
        int b[]={5,8,12};
        System.out.println(electronic(a,b,34));
    }
}
