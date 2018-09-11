package com.example.a2937;

import org.junit.Assert;
import org.junit.Test;

public class CharacterReplaceTest
{
    @Test
    public void handleNullString()
    {
        String result = StringReplacer.ReplaceCharacter(null, 'a','b');

        Assert.assertEquals("",result);
    }

    @Test
    public void handleEmptyString()
    {
        String result = StringReplacer.ReplaceCharacter("", 'a','b');

        Assert.assertEquals("",result);
    }

    @Test
    public void replacesSingleInstanceOfCharacter()
    {
        String result = StringReplacer.ReplaceCharacter("like", 'l','b');

        Assert.assertEquals("bike",result);
    }

    @Test
    public void replacesMultipleInstancesOfCharacter()
    {
        String result = StringReplacer.ReplaceCharacter("funny", 'n','r');

        Assert.assertEquals("furry",result);
    }


}
