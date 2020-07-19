public class Prog2 {
	public static void main(String[] args) {
		emipm(1200, 10, 1);
	}
	public static void emipm(double p,double r, double t) {
        r=r/(12*100);
        t=t*12; 
        double emi= (p*r*Math.pow(1+r,t))/(Math.pow(1+r,t)-1);
		System.out.println(emi);
	}
}