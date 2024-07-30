import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int[] fir = {3,2,1};
        int[] sec = {4,5,6};
       int[] ans= Merge(fir,sec);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] Merge(int[] fir, int[] sec){
        int[] mix = new int[fir.length + sec.length];
        int i =0;
        int j= 0;
        int k = 0;
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
