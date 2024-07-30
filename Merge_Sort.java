import java.util.Arrays;

public class Merge_Sort {
    public static void main(String[] args) {
        int[] arr = {5,9,4,2,7,8,0,3,1};
        arr = MergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] MergeSort(int[] ans){
        if (ans.length == 1){
            return ans;
        }
        int mid = ans.length/2;
        int[] left = MergeSort(Arrays.copyOfRange(ans, 0, mid));
        int[] right = MergeSort(Arrays.copyOfRange(ans, mid,ans.length));
        return Merge(left, right);

    }
    public static int[] Merge(int[] fir, int[] sec){
        int[] mix = new int[fir.length + sec.length];
        int i = 0;
        int j= 0;
        int k = 0;
        while (i < fir.length && j < sec.length){
            if (fir[i] < sec[j]){
                mix[k] = fir[i];
                i++;
            }else {
                mix[k] = sec[j];
                j++;
            }
            k++;
        }
        while (i < fir.length){
            mix[k] = fir[i];
            i++;
            k++;
        }
        while (j < sec.length){
            mix[k] = sec[j];
            j++;
            k++;
        }
        return mix;
    }
}
