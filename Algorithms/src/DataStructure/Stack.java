package DataStructure;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by JT on 2017/10/5.
 */
public class Stack<Item> implements Iterable<Item>
{
    //使用数组实现，数组调节原则：数据满时，扩大两倍；数据少于1/4时，缩小两倍
    private Item[] items;

    //index时真实下标，从0开始
    private int index;

    private int size;

    public Stack(int size)
    {
        items =  (Item[]) new Object[size];
        this.size = size;
        index = 0;
    }

    public boolean isEmpty()
    {
        return 0 >= index;
    }

    public boolean isFull()
    {
        return index >= size - 1;
    }

    public Item pop()
    {
        if (isEmpty())
        {
            //throw exception or return null
        }

        Item item = items[index --];
        items[index + 1] = null;
        if (0 < index && this.size / 4 >= index)
        {
            reSize(this.size / 2);
        }

        return item;
    }

    public void push(Item item)
    {
        if (isFull())
        {
            reSize(this.size * 2);
        }

        items[++ index] = item;
    }

    private void reSize(int size)
    {
        if (index >= size - 1)
        {
            //throw exception
        }

        Item[] newArray = (Item[]) new Object[size];
        System.arraycopy(items, 0, newArray, 0, index + 1);
        items = newArray;
        this.size = size;
    }

    public Iterator<Item> iterator()
    {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<Item>
    {
        private int i = index;

        public boolean hasNext()
        {
            return 0 < i;
        }

        public Item next()
        {
            if (0 >= i)
            {
                throw new NoSuchElementException();
            }

            return items[i --];
        }

        //暂时不支持
        public void remove()
        {

        }
    }
}
