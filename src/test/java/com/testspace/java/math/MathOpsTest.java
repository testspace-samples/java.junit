package com.testspace.java.math;

import junit.framework.TestCase;

public class MathOpsTest extends TestCase
{

    private int value1;
    private int value2;

    public MathOpsTest(String testName)
    {
        super(testName);

        value1 = 3;
        value2 = 5;
    }

    public void testAdd1()
    {
        int total = 8;
        int sum = MathOps.add(value1, value2);
        assertEquals(sum, total);
    }

    public void testAdd2willFail()
    {
        int total = 8;
        int sum = MathOps.add(value1, value2);
        // force a failure
        sum++;
        assertEquals(sum, total);
    }

    public void testAdd3()
    {
        int total = 9;
        int sum = MathOps.add(value1, 0);
        assertEquals(sum, value1);
    }

    public void testSub1()
    {
        int total = 0;
        int sub = MathOps.sub(4, 4);
        assertEquals(sub, total);
    }
}
