public class Fraction
{
    private int num,    // numerator of Fraction object
                den;    // denominator of Fraction object
    
    // default constructor: sets object value to 1/1
    public Fraction ()
    {
        num = 1;
        den = 1;
    }

    // constructor: sets values for num & den
    public Fraction (int n, int d)
    {
        num = n;
        this.setDenominator(d);
    }
    
    public Fraction (int n)
    {
        den = 1;
        num = n;
    }
    
    public Fraction (double equiv){
       
    }
      
    public void setDenominator (int den)
    {
        if (den != 0)
            this.den = den;
        else throw new RuntimeException("Illegal: zero denominator");
    }
    
    public void setNumerator (int n)
    {
        num = n;
    }
    
    public String toString ()
    {
        return "" + num + "/" + den;
    }
    
    public double toDouble()
    {
        return (double)num/den;
    }
    
    public void setNewValue (int n, int d)
    {
        num = n;
        setDenominator(d);
    }
    
    public int getNum ()
    {
        return num;
    }
    
    public int getDen ()
    {
        return den;
    }
    
    public Fraction simplify ()
    {
        int n = num;
        int d = den;
        n = n/gcd(num,den);
        d = d/gcd(num,den);
        return new Fraction(n,d);
    }
    
    private int gcd (int m, int n)
    {
        int r;
        while (n != 0)
        {
            r = n;
            n = m % r;
            m = r;
        }
        return m;
    }
           
            
    public static Fraction multiply (Fraction f1, Fraction f2)
    {
        int n = f1.getNum() * f2.getNum();
        int d = f1.getDen() * f2.getDen();
        return new Fraction(n,d);
    }
    
    public Fraction times (Fraction f)
    {
        return multiply(this, f);
    }
    
    public Fraction times (int i)
    {
        return new Fraction(i*getNum(), den);
    }
    
    
    
    public static Fraction divide (Fraction f1, Fraction f2)
    {
        int n = f1.getNum() * f2.getDen();
        int d = f1.getDen() * f2.getNum();
        return new Fraction(n, d);
    }
    
    public Fraction dividedBy (Fraction f)
    {
        return divide(this, f);
    }
    
    public Fraction dividedBy (int i)
    {
        return new Fraction (num, den * i);
    }
    
    public static Fraction add (Fraction f1, Fraction f2)
    {
        int n = (f1.getNum() * f2.getDen()) + (f2.getNum() * f1.getDen());
        int d = f1.getDen() * f2.getDen();
        return new Fraction (n, d);
    }
    
    public Fraction plus (Fraction f){
        f + 
    }
    // public Fraction plus (int i)
    // public static Fraction subtract (Fraction f1, Fraction f2)
    // public Fraction minus (Fraction f)
    // public Fraction minus (int i)
    // public int compareTo (Fraction f)
    // public boolean equals (Fraction f)
    
}