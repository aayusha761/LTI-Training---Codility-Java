class Festival {
	public int noOfDaysLeave() {
		return 1;
	}
}

class Diwali extends Festival {
	public int noOfDaysLeave() {
		return 3;
	}
}

class Christmas extends Festival {
	public int noOfDaysLeave() {
		return 2;
	}
}
public class Prog12 {
	public static void main(String[] args) {
		Festival f = new Diwali();
		System.out.println(f.noOfDaysLeave());
		
		f = new Christmas();
		System.out.println(f.noOfDaysLeave());
	}
}