package cs.csmath.complexnumber;

import org.junit.Test;
import static org.junit.Assert.*;

public class ComplexNumberTest
{

    static final double DELTA = 0.000001;
    @Test
    public void getRealPart()
    {
        ComplexNumber cn = new ComplexNumber(1.0, 1.0);
        double realPart = cn.getRealPart();
        assertEquals(1.0, realPart, DELTA);
    }

    @Test
    public void setRealPart()
    {
        ComplexNumber cn = new ComplexNumber();
        cn.setRealPart(2.0);
        assertEquals(2.0, cn.getRealPart(), DELTA);
    }

    @Test
    public void getImagPart()
    {
        ComplexNumber cn = new ComplexNumber(1.0, 1.0);
        double imagPart = cn.getImagPart();
        assertEquals(1.0, imagPart, DELTA);
    }

    @Test
    public void setImagPart()
    {
        ComplexNumber cn = new ComplexNumber();
        cn.setImagPart(2.0);
        assertEquals(2.0, cn.getImagPart(), DELTA);
    }

    @Test
    public void add()
    {
        ComplexNumber cn = new ComplexNumber(4.5,3.0);
        ComplexNumber cn1 = new ComplexNumber(6.0, 4.0);
        cn.add(cn1);
        assertEquals(10.5, cn.getRealPart(), DELTA);
        assertEquals(7.0, cn.getImagPart(), DELTA);
    }

    @Test
    public void sub()
    {
        ComplexNumber cn = new ComplexNumber(2.0, 2.0);
        ComplexNumber cn1 = new ComplexNumber(1.0, 1.0);
        cn.sub(cn1);
        assertEquals(1.0, cn.getRealPart(), DELTA);
        assertEquals(1.0, cn.getImagPart(), DELTA);
    }

    @Test
    public void mult()
    {
        ComplexNumber cn = new ComplexNumber(2.0, 2.0);
        ComplexNumber cn1 = new ComplexNumber(2.0, 2.0);
        cn.mult(cn1);
        assertEquals(0.0, cn.getRealPart(), DELTA);
        assertEquals(8.0, cn.getImagPart(), DELTA);
    }

    @Test
    public void div()
    {
        ComplexNumber cn = new ComplexNumber(4.0, 4.0);
        ComplexNumber cn1 = new ComplexNumber(2.0, 2.0);
        cn.div(cn1);
        assertEquals(2.0, cn.getRealPart(), DELTA);
        assertEquals(0.0, cn.getImagPart(), DELTA);
    }

    @Test
    public void testDivionDivByZeroException()
    {
        ComplexNumber cn1 = new ComplexNumber(2.5, 3.2);
        ComplexNumber cn2 = new ComplexNumber(0.0,0.0);
        try
        {
            cn1.div(cn2);
            fail();
        }
        catch (ArithmeticException e)
        {
            e.printStackTrace();
        }
    }


    @Test
    public void conj()
    {
        ComplexNumber cn = new ComplexNumber(2.0, 3.0);
        ComplexNumber cn1 = cn.conj();
        assertEquals(2.0, cn1.getRealPart(), DELTA);
        assertEquals(-3.0, cn1.getImagPart(), DELTA);
    }

    @Test
    public void abs()
    {
        ComplexNumber cn = new ComplexNumber(-2.5, -3.0);
        double cnABS =cn.abs();
        assertEquals(Math.sqrt(15.25), cnABS, DELTA);
    }

    @Test
    public void add1()
    {
        ComplexNumber cn = new ComplexNumber(2.5, 4.0);
        ComplexNumber cn1= new ComplexNumber(3.0, 2.0);
        ComplexNumber cn2 = ComplexNumber.add(cn, cn1);
        assertEquals(5.5, cn2.getRealPart(), DELTA);
        assertEquals(6.0, cn2.getImagPart(), DELTA);
    }

    @Test
    public void sub1()
    {
        ComplexNumber cn = new ComplexNumber(2.5, 4.0);
        ComplexNumber cn1= new ComplexNumber(3.0, 2.0);
        ComplexNumber cn2 = ComplexNumber.sub(cn, cn1);
        assertEquals(-0.5, cn2.getRealPart(), DELTA);
        assertEquals(2.0, cn2.getImagPart(), DELTA);
    }

    @Test
    public void mult1()
    {
        ComplexNumber cn = new ComplexNumber(2.5, 4.0);
        ComplexNumber cn1= new ComplexNumber(3.0, 2.0);
        ComplexNumber cn2 = ComplexNumber.mult(cn, cn1);
        assertEquals(-0.5, cn2.getRealPart(), DELTA);
        assertEquals(17.0, cn2.getImagPart(), DELTA);
    }

    @Test
    public void div1()
    {
        ComplexNumber cn = new ComplexNumber(6.0, 5.0);
        ComplexNumber cn1= new ComplexNumber(3.0, 2.5);
        ComplexNumber cn2 = ComplexNumber.div(cn, cn1);
        assertEquals(2, cn2.getRealPart(), DELTA);
        assertEquals(0, cn2.getImagPart(), DELTA);
    }

    @Test
    public void testToString()
    {
        ComplexNumber cn = new ComplexNumber();
        String s = cn.toString();
        assertEquals("0.0+0.0i", s);
    }
}