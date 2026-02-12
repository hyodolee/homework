package hm0212;

public class Audio extends Elec implements ElecFunction{
	int volumn;
	
	@Override
	public void start() {
		//System.out.println(this.code + "의 "+ this.toString() + "를 " + this.volumn + "으로 듣는다");
		System.out.println(this.toString());
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

	public Audio() {}
	public Audio(int volumn) {this.volumn = volumn;}
	public Audio(String code, int cost, int volumn) {
		super(code,cost);
		this.volumn = volumn;
	}
	
//	@Override
//	public String toString() {
//		return "Audio";
//	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		//builder.append(super.toString());
		builder.append(this.code);
		builder.append("의 Audio를 "); 
		builder.append(this.volumn);
		builder.append("으로 듣는다");
		return builder.toString();
	}

}
