package zzALANHESAPLAMA;

public class shape {

	private double kenar1;
	private double kenar2;
	private double kenar3;
	
	
	
	
	//kare için
	public void setValues(double kenar1) {
		
		this.kenar1=kenar1;
		
		
	}
	
	//dikdörtgen için
public void setValues(double kenar1,double kenar2) {
		
		this.kenar1=kenar1;
		this.kenar2=kenar2;
		
		
	}


//üçgen için 

public void setValues(double kenar1,double kenar2, double kenar3) {
	
	this.kenar1=kenar1;
	this.kenar2=kenar2;
	this.kenar3=kenar3;
	
	
}

public double getKenar1() { return kenar1;
}
public double getKenar2() { return kenar2;
}
public double getKenar3() { return kenar3;
}




}
