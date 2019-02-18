//Complex.java
//Rami Alrwais
//raalrwai
//pa6
//Computes serveral arithmatic equations using an imaginary and real number

class Complex{
//Private data fields
  private double re;
  private double im;
//public Constant Fields

  public static final Complex ONE = Complex.valueOf(1,0);
  public static final Complex ZERO = Complex.valueOf(0,0);
  public static final Complex I = Complex.valueOf(0,1);
//Constructors
  Complex(double a, double b){
    this.re = a;
    this.im = b;
  }

  Complex(double a){
    this.re = a;
    this.im = 0;
  }
  Complex(String s){//accept expressions of different types
    double [] temp = parseComplex(s);
    this.re = temp[0];
    this.im = temp[1];
  }

  Complex copy(){//  Complex a = b;    b.im = 0;   
    Complex x = new Complex(re, im);
    return x;
  }
  Complex add(Complex z){//returns a new complex of x + this
    Complex sum = new Complex(this.re + z.re, this.im + z.im);
    return sum;

  }
  Complex negate(){//returns negative complex of this
    Complex neg = new Complex(-this.re, -this.im);
    return neg;
  }
  Complex sub(Complex z){//subtracts this minus x
    Complex subtract = new Complex(this.re - z.re, this.im - z.im);
    return subtract;
  }
  Complex mult(Complex z){//returns a new complex of this * x
    Complex multiply = new Complex(this.re * z.re - this.im * z.im, this.re * z.im +
        z.re * this.im);
    return multiply;
  }
  Complex recip(){//returns reciprocal of this
    Complex reciprocal = new Complex(this.re/((this.re*this.re)+(this.im*this.im)), -
        this.im/((this.re*this.re) + (this.im*this.im)));
    return reciprocal;
  }

  Complex div(Complex z){//quotient of this and x
    Complex division = new Complex((this.re * z.re +this.im* z.im)/((z.re*z.re)+
          (z.im*z.im)), (this.im *z.re - this.re*z.im)/((z.re*z.re) + (z.im*z.im)));
    return division;
  }
  Complex conj(){//retruns conjugate of this Complex
    Complex conjugate = new Complex(this.re, - this.im);
    return conjugate;
  }
  double Re(){
    return re;
  }
  double Im(){ 
    return im;
  }
  double abs(){
    double absolute = Math.sqrt((this.re*this.re)+(this.im*this.im));
    return absolute;
  }
  double arg(){
    return Math.atan2(im, re);
  }

  public String toString(){//Returns a string representation of this complex
    String rn = Double.toString(re);
    String in = Double.toString(im);
    if (re!=0 && im>0) {
      return rn+"+"+in+"i";
    }
    if (re!=0 && im<0) {
      return rn+(in)+"i";
    }
    if (im==0) {
      return rn;
    }
    if (re==0) {
      return in+"i";
    }
  return ("0");
  }
  public boolean equals(Object obj){//Returns true if this and obj have same xy
    boolean eq = false;
    Complex B;
    if( obj instanceof Complex){
      B = (Complex)obj;
      eq =( re==B.re && im ==B.im);
    }
    return eq;
  } 

  static Complex valueOf(double a, double b){//return with real part and imag b
    Complex ab = new Complex(a, b);
    return ab;
  }
  static Complex valueOf(double a){//returns a 0
    Complex na = new Complex(a, 0);
    return na;
  }
  static Complex valueOf(String s){//Returns a new complex constructed from s
    Complex str_s = new Complex(s);
    return str_s;
  }

  // parseComplex()
  // // Returns a double[] of length 2 containing (real, imaginary) parts
  // // of a complex number represented by string argument str.  Throws a
  // // NumberFormatException if str cannot be parsed as a complex number.
  static double[] parseComplex(String str){
    double[] part = new double[2];
    String s = str.trim();
    String NUM = "(\\d+\\.\\d*|\\.?\\d+)";
    String SGN = "[+-]?";
    String OP =  "\\s*[+-]\\s*";
    String I =   "i";
    String OR =  "|";
    String REAL = SGN+NUM;
    String IMAG = SGN+NUM+"?"+I;
    String COMP = REAL+OR+
      IMAG+OR+
      REAL+OP+NUM+"?"+I;
    if( !s.matches(COMP) ){
      throw new NumberFormatException(
          "Cannot parse input string \""+s+"\" as Complex");
    }
    s = s.replaceAll("\\s","");     
    if( s.matches(REAL) ){
      part[0] = Double.parseDouble(s);
      part[1] = 0;
    }else if( s.matches(SGN+I) ){
      part[0] = 0;
      part[1] = Double.parseDouble( s.replace( I, "1.0" ) );
    }else if( s.matches(IMAG) ){
      part[0] = 0;
      part[1] = Double.parseDouble( s.replace( I , "" ) );
    }else if( s.matches(REAL+OP+I) ){
      part[0] = Double.parseDouble( s.replaceAll( "("+REAL+")"+OP+".+" , "$1" ) );
      part[1] = Double.parseDouble( s.replaceAll( ".+("+OP+")"+I , "$1"+"1.0" ) );
    }else{   //  s.matches(REAL+OP+NUM+I) 
      part[0] = Double.parseDouble( s.replaceAll( "("+REAL+").+"  , "$1" ) );
      part[1] = Double.parseDouble( s.replaceAll( ".+("+OP+NUM+")"+I , "$1" ) );
    }
    return part;
  }
}
