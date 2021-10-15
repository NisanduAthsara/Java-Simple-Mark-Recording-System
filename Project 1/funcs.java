
public class funcs{

	private String name;
	private int sub1,sub2,sub3,sub4,sub5;
	private double avg;
	private int sum;

	funcs(String name,int sub1,int sub2,int sub3,int sub4,int sub5){
		this.name = name;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.sub4 = sub4;
		this.sub5 = sub5;
	}

	public String getName(){
		return name;
	}

	public int getSub1(){
		return sub1;
	}

	public int getSub2(){
		return sub2;
	}

	public int getSub3(){
		return sub3;
	}

	public int getSub4(){
		return sub4;
	}

	public int getSub5(){
		return sub5;
	}

	public int getSum(){
		sum = sub1+sub2+sub3+sub4+sub5;
		return sum;
	}

	public double getAvg(){
		avg = ((double)sum)/5;
		return avg;
	}



}