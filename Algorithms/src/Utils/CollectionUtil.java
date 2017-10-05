package Utils;

import java.util.Collection;

/**
 * Created by JT on 2017/10/2.
 */
public class CollectionUtil
{
    public static boolean isEmpty(Collection collection)
    {
        return !(null == collection || Constants.NUM0 >= collection.size());
    }
}
