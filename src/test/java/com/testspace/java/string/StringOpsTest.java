package com.testspace.java.string;

import junit.framework.TestCase;

public class StringOpsTest extends TestCase
{

    private String sL;
    private String sR;
    private String sEmpty;

    public StringOpsTest(String testName)
    {
        super(testName);

        sL = "left";
        sR = "right";
        sEmpty = "";
    }

    public void testConcat1()
    {
        String sOut = StringOps.concat(sL, sR);
        assertEquals("leftright", sOut);
    }

    public void testConcat2()
    {
        String sOut = StringOps.concat(sEmpty, sL);
        assertEquals(sOut, "left");
    }

    public void testConcat3()
    {
        String sOut = StringOps.concat(sL, sEmpty);
        assertEquals(sOut, "left");
    }

    public void testReverse1()
    {
        String sOut = StringOps.reverse(sEmpty);
        assertEquals(sOut, sEmpty);
    }

    public void testReverse2()
    {
        String sOut = StringOps.reverse("dcba");
        assertEquals(sOut, "abcd");
    }

    public void testReverse3WillFail()
    {
        String sOut = StringOps.reverse("edcba");
        assertEquals(sOut, "abcd");
    }
}
