
public class Complex {
	
	public static int nrAfisare = 0;
	 double re;
	 double img;
	 double re2;
	 double img2;
	 double nrComplexe;
	 double complex;
	 public Complex(double re, double img, double re2, double img2) {
		 setComplex(re, img, re2,img2);
		 nrAfisare++;
	 }
  public void setComplex(double re, double img, double re2, double img2){
	 this.re = re;
	 this.img = img;
	 this.re2 = re2;
	 this.img2 = img2;
	 this.nrComplexe=Math.sqrt(re2*re2+img2*img2);
	 this.complex = complex+nrComplexe;
	 this.nrComplexe=Math.sqrt(re*re+img*img);
	 this.complex = complex+nrComplexe;
		 
 }
 

@Override
public String toString() {
	return "Complex |" + re + " , " + img + "i" +"|" + "+" + "|" + re2 + " , " + img2 + "i" + "|" + " = " + complex;
}
}
