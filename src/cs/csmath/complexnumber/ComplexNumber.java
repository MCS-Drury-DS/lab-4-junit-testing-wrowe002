package cs.csmath.complexnumber;

public class ComplexNumber
{
    private double realPart;
    private double imagPart;

    public ComplexNumber()
    {
        realPart =0.00;
        imagPart =0.00;
    }

    public ComplexNumber(double real, double imag)
    {
        this.realPart =real;
        this.imagPart =imag;
    }

    public ComplexNumber(ComplexNumber cn)
    {
        this.realPart = cn.getRealPart();
        this.imagPart = cn.getImagPart();
    }

    public double getRealPart()
    {
        return realPart;
    }

    public void setRealPart(double realPart)
    {
        this.realPart = realPart;
    }

    public double getImagPart()
    {
        return imagPart;
    }

    public void setImagPart(double imagPart)
    {
        this.imagPart = imagPart;
    }

    public void add(ComplexNumber otherCN)
    {
        double a = this.getRealPart();
        double b = this.getImagPart();
        double c = otherCN.getRealPart();
        double d = otherCN.getImagPart();

        this.setRealPart(a + c);
        this.setImagPart(b + d);
    }

    public void sub(ComplexNumber otherCN)
    {
        double a = this.getRealPart();
        double b = this.getImagPart();
        double c = otherCN.getRealPart();
        double d = otherCN.getImagPart();

        this.setRealPart(a - c);
        this.setImagPart(b - d);
    }

    public void mult(ComplexNumber otherCN)
    {
        double a = this.getRealPart();
        double b = this.getImagPart();
        double c = otherCN.getRealPart();
        double d = otherCN.getImagPart();

        this.setRealPart((a*c) - (b*d));
        this.setImagPart((b*c) + (a*d));
    }

    public void div(ComplexNumber otherCN) throws ArithmeticException
    {

        double a = this.getRealPart();
        double b = this.getImagPart();
        double c = otherCN.getRealPart();
        double d = otherCN.getImagPart();

        double denominator = (c * c) + (d * d);
        if (Math.abs(denominator) < 0.000001)
        {
            throw new ArithmeticException();
        }
        this.setRealPart(((a * c) + (b * d)) / ((c * c) + (d * d)));
        this.setImagPart(((b * c) - (a * d)) / ((c * c) + (d * d)));


    }

    public ComplexNumber conj()
    {
        return new ComplexNumber(this.getRealPart(),-(this.getImagPart()));
    }

    public double abs()
    {
        return Math.sqrt((this.getRealPart() * this.getRealPart()) + (this.getImagPart() * this.getImagPart()));
    }

    public static ComplexNumber add(ComplexNumber firstCN, ComplexNumber secondCN)
    {
        ComplexNumber cn1 = new ComplexNumber(firstCN);
        ComplexNumber cn2 = new ComplexNumber(secondCN);

        cn1.add(cn2);
        return cn1;
    }

    public static ComplexNumber sub(ComplexNumber firstCN, ComplexNumber secondCN)
    {
        ComplexNumber cn1 = new ComplexNumber(firstCN);
        ComplexNumber cn2 = new ComplexNumber(secondCN);

        cn1.sub(cn2);
        return cn1;
    }

    public static ComplexNumber mult(ComplexNumber firstCN, ComplexNumber secondCN)
    {
        ComplexNumber cn1 = new ComplexNumber(firstCN);
        ComplexNumber cn2 = new ComplexNumber(secondCN);

        cn1.mult(cn2);
        return cn1;
    }

    public static ComplexNumber div(ComplexNumber firstCN, ComplexNumber secondCN)
    {
        ComplexNumber cn1 = new ComplexNumber(firstCN);
        ComplexNumber cn2 = new ComplexNumber(secondCN);

        cn1.div(cn2);
        return cn1;
    }

    public String toString()
    {
        return (this.getRealPart() + "+" + this.getImagPart() + "i");
    }

}
