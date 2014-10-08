package com.company;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * Created by Art on 10/7/2014.
 */
public class WashoosEvent extends Event
{
    private boolean hasAutoWinStick = false;
    private int numWashoos = 5;
    protected String returnString1;
    protected String returnString2;
    @Override
    public String getExtraInfo()
    {
        returnString1 = Boolean.toString(hasAutoWinStick);
        returnString2 = Integer.toString(numWashoos);
        return returnString1.concat(" " + returnString2);
    }
}
