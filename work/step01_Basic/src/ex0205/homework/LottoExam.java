package ex0205.homework;

/**
 *  주제: 로또번호 6개를 배열방에서 중복되지않게 만들어서 출력하기
 *  작성일: 2026-02-05
 *  작성자: 이효도
 **/
class LottoFunction{
	int lottos[] = new int[6];
	
	/**
	 *  로또번호 중복체크
	 *  @param : 중복체크 번호
	 *  @return : 중복여부
	 **/
	public boolean duplicateChk(int checkNum) {
		
		for(int i = 0; i < lottos.length; i++){
			if(checkNum == lottos[i]) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 *  로또번호 배열방에 입력
	 *  @param : 로또 번호 배열
	 *  @return :
	 **/
	public void setLottoNum(int ...lottos) {
		
		for(int i = 0; i < lottos.length; i++){
			this.lottos[i] = lottos[i]; 
		}
	}

	/**
	 *  로또번호 내림차순 정렬 
	 *  @param : 
	 *  @return :
	 **/
	public void setDesc() {
		for(int i = 0; i < this.lottos.length; i++){
			this.lottos[i] = lottos[i]; 
		}
		
		//선택 정렬알고리즘 사용해서 내림차순 정렬
		for(int	i=0; i < this.lottos.length; i++) {
		 	for(int j = i+1; j < this.lottos.length; j++) {
		 		if(this.lottos[i] < this.lottos[j]) {
		 			int temp = this.lottos[i];
		 			this.lottos[i] = this.lottos[j];
		 			this.lottos[j] = temp;
		 		}
		 	}
		 }
	}

	/**
	 *  로또번호 보여주기
	 *  @param : 
	 *  @return :
	 **/
	public void showLottos() {
		System.out.println("로또번호는:");
		for(int i = 0; i < this.lottos.length; i++){
			System.out.print(lottos[i]+" ");
		}
	}
}

public class LottoExam {

	public static void main(String[] args) {
		LottoFunction lottoFunction = new LottoFunction();
		int lottos[] = new int[6];
		int checkNum = 0;
		boolean chk = false;
		
		// lottos에 중복안되는 번호 담기
		for(int i=0; i<lottos.length; i++) {
			//랜덤 로또 번호가 중복되는게 없으면 루프 탈출
			while(true) {
				checkNum = (int) (Math.random() * 45) + 1; // 1에서 45 사이의 정수
				chk = lottoFunction.duplicateChk(checkNum);
				
				if(!chk) break;
			}
			
			lottos[i] = checkNum;
		}
		
		//생성한 로또 번호를 배열방에 담기
		lottoFunction.setLottoNum(lottos);
		
		//배열방의 값을 내림차순 정렬 하기
		lottoFunction.setDesc();
		
		//로또번호 출력하기
		lottoFunction.showLottos();
		
	}
}
