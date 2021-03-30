public class ThreadClassDemo {

    public static void main(String[] args)
    {
        final int[] nums = new int[]{ 13,5,9,7,23,2,1,6,8,0,3,4 };

        Thread thread = new Thread(new MaximumNumber(nums));
        thread.start();
    }

}
