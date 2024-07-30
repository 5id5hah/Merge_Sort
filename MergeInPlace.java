import java.util.Arrays;

public class MergeInPlace {
    public static void main(String[] args) {
        int[] arr = {5,9,4,2,7,8,0,3,1};
        MergeSortInplace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static void MergeSortInplace(int[] ans, int s, int e){
        if (e - s == 1){
            return;
        }
        int mid = (s + e)/2;
         MergeSortInplace(ans, s, mid);
         MergeSortInplace(ans, mid,e);
         Merge(ans, s, mid, e);

    }
    public static void Merge(int[] num, int s, int mid, int e){
        int[] mix = new int[e - s];
        int i = s;
        int j = mid;
        int k = 0;
        while (i < mid && j < e){
            if (num[i] < num[j]){
                mix[k] = num[i];
                i++;
            }else {
                mix[k] = num[j];
                j++;
            }
            k++;
        }
        while (i < mid){
            mix[k] = num[i];
            i++;
            k++;
        }
        while (j < e){
            mix[k] = num[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length; l++) {
            num[s+l] = mix[l];
        }

    }
}
