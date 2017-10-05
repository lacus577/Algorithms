package Data;

import Utils.CollectionUtil;
import Utils.StringUtil;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by JT on 2017/10/2.
 */
public class Data
{
    private final String CURRENT_DIR = System.getProperty("user.dir");

    public int[] txt2Array(String fileName)
    {
        List<Integer> txt2ListResult = txt2List(fileName);
        if (CollectionUtil.isEmpty(txt2ListResult))
        {
            //
        }

        int len = txt2ListResult.size();
        int[] result = new int[len];
        for (int i = 0; i < len; i++)
        {
            result[i] = txt2ListResult.get(i);
        }

        return result;
    }

    public List<Integer> txt2List(String fileName)
    {
        if (StringUtil.isEmpty(fileName))
        {
            //throw new
        }

        List<Integer> result = new ArrayList<Integer>();
        try
        {
            File file = new File(getFilePath(fileName));
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = null;

            //使用readLine方法，一次读一行
            while(null != (line = bufferedReader.readLine()))
            {
                //todo 判断valueof
                result.add(Integer.valueOf(line));
            }

            bufferedReader.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        return result;
    }

    private String getFilePath(String fileName)
    {
        if (StringUtil.isEmpty(fileName))
        {
            //
        }

        return CURRENT_DIR + File.separator + fileName;
    }
}
