package Utils;

/**
 * Created by JT on 2017/10/2.
 */
public class StringUtil
{
    public static boolean isEmpty(String str)
    {
        if (null == str || Constants.NUM0 == str.length())
        {
            return false;
        }

        return true;
    }
}
