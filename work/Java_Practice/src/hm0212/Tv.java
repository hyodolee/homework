package hm0212;

public class Tv extends Elec implements ElecFunction{
	int channel;
	
	@Override
	public void start() {
		//System.out.println(this.code + "제품 "+ this.toString() + "를 " + this.channel + "을 본다");
		System.out.println(this.toString());
		//A01제품 TV를 12을 본다
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

	public Tv() {}
	public Tv(int channel) {this.channel = channel;}
	public Tv(String code, int cost, int channel) {
		super(code,cost);
		this.channel = channel;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		//builder.append(super.toString());
		builder.append(this.code);
		builder.append("제품 TV를 "); 
		builder.append(this.channel);
		builder.append("을 본다");
		return builder.toString();
	}

}
