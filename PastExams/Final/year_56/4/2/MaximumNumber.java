import java.util.*;

public class MaximumNumber implements  Runnable {

    private int[] arr;

    public MaximumNumber(int[] arr)
    {
        this.arr = arr;
    }

    @Override
    public void run() {

        int max_num = -1;
        if(this.arr.length > 0 && this.arr != null)
        {
            max_num = this.arr[0];
        }

        for(int i : this.arr)
        {
            if(max_num < i)
            {
                max_num = i;
            }
        }

        // no need to synchronize value between 2 threads
        System.out.println(max_num);
        // another way :)
        // System.out.println(Arrays.stream(arr).max().getAsInt());
    }
}
