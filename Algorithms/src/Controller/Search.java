package Controller;

import Utils.Constants;

import java.util.logging.Logger;

/**
 * Created by JT on 2017/10/2.
 */
public class Search
{
    //Logger LOGGER = new Logger(Search.class);
    public int binarySearch(int[] sortedArray, int key)
    {
        int length = sortedArray.length;
        if (0 >= length)
        {
            return -1;
            //throw new ArrayIndexOutOfBoundsException();
        }

        int index_left = 0, index_right = length - 1;
        while (index_left <= index_right)
        {
            int mid = (index_left + index_right) / 2;
            if (sortedArray[mid] == key)
            {
                return mid;
            }
            else if (sortedArray[mid] < key)
            {
                index_left = mid + 1;
            }
            else
            {
                index_right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args)
    {
        Search search = new Search();
        int[] array =
    }

}
