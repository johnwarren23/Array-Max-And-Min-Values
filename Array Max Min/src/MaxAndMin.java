public class MaxAndMin
{
    public static void main(String[] args)
    {
        int[] arr = {10, 34, 25, 220, 65, 45, 54, 37, 77, 92, 12, 66, 87};

        int min = arr[0]; //smallest value
        int max = arr[0]; //largest value
        int sLarge = arr[0]; //second largest value
        int sSmall = arr[arr.length - 1]; //second smallest value

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] < min) //if the current value is smaller than the smallest value, make that the smallest value
            {
                min = arr[i];
            }
            if (arr[i] > max) //if the current value is larger than the largest value, make that the largest value
            {
                max = arr[i];
            }
            if (arr[i] > sLarge && arr[i] != max) //finds the second largest value
            {
                sLarge = arr[i];
            }
            if (arr[i] < sSmall && arr[i] != min) //finds the second smallest value
            {
                sSmall = arr[i];
            }
        }
        System.out.println("Smallest Value: " + min); //10
        System.out.println("Largest Value: " + max); //220
        System.out.println("\nSecond Smallest Value: " + sSmall); //92
        System.out.println("Second Largest Value: " + sLarge); //12
    }
}

