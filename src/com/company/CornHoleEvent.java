package com.company;

/**
 * Created by Art on 10/7/2014.
 */
public class CornHoleEvent extends Event
{
    private int numBeanBags = 4;
    @Override
    public String getExtraInfo()
    {
        return Integer.toString(numBeanBags);
    }
}
