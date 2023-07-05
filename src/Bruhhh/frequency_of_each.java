package Bruhhh;
// frequency of each element
public class frequency_of_each {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 4, 2, 3, 2};
        int freq[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    freq[j] = -1;
                    count++;
                }
            }
            if (freq[i] != -1) {
                freq[i] = count;
            }
        }
        for (int i = 0; i <= arr.length - 1; i++) {
            if (freq[i] != -1) {

            }
            System.out.println("the frequency of " + arr[i] + "--->" + freq[i]);
        }

    }
}
