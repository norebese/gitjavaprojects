package com.kh.javai;

//class에 접근제한자를 설정하지 않으면(ex:public)
//defaul로 설정되고 다른 패키지에서 사용할 수 없다
public class Student {
	//필드(데이터 집합)
	static int count = 0; // 총학생의 수
	String name;
	int age;
	private String gender;
	int mathScore; //단어하나 끝나고 대문자로 보통 쓴다(카멜 캐이스)
	int enScore;
	int koScore;
	
	// 이렇게 선별하는 과정이 추상화
	
	// 생성자
	// 인스턴스 객체를 생성할 때 데이터를 초기화하기위해
	// 자동으로 한번만 실핼하는 특별한 매서드
	//매서드처럼 접근해서 실행할 수 없으며 클래스의 이름과 동일한 이름을 가진다
	//초기화를 위한 매서드이기 때문에 반환갑은 없다.
	/*기본생성자
	 * 생성자를 아무것도 작성하지 않았을 때
	 * 컴파일러가 기본적으로 생성해주는 생성자(아무 기능이 없다)
	 * public Student(){}
	 */
	
	public Student(){
		
//		System.out.println("student의 기본 생성자");
	}
	public Student(String tName){
		System.out.println("tName을 매개변수로 받는 생성자");
	}
	public Student(String tName, int tAge){
		
		System.out.println("tName, int tAge을 매개변수로 받는 생성자");
	}
	//생성자는 여러개 생성이 가능하다, 단 구분이 되어야 한다
	//생성자가 여러개일때는 매개변수를 통해서 식별한다.
	// public Student(int tAge)
	// public Student(double tAge)
	// 위의 두개의 코드퍼럼 애매한 코드는 쓰면 안됨
	public Student(String tName, int tAge, String tGender){
		count++; 
		name = tName;
		age = tAge;
		gender = tGender;
		
		System.out.println("이름 :"+name);
		System.out.println("나이 :"+age);
		System.out.println("성멸 :"+gender);
		System.out.println("학생이 추가되었습니다");
	}
	public Student(int tEnscore, int tKoscore, int tMathscore){
		enScore = tEnscore;
		koScore = tKoscore;
		mathScore = tMathscore;
	}

	//매서드 (기능 집합)
	//info매서드 생성
	//저는 ㅇㅇ살의 상ㅇㅇ ㅇㅇㅇ입니다.
	public void info() {
		System.out.println(name+"\t"+age+"\t"+gender);
	}
	public void score() {
		int avr=(enScore+koScore+mathScore)/3;
		System.out.println("영어점수 : "+enScore);
		System.out.println("국어점수 : "+koScore);
		System.out.println("수학점수 : "+mathScore);
		System.out.println("총합 : "+(enScore+koScore+mathScore));
		System.out.println("평균 : "+avr);
		if(enScore>=40&&koScore>=40&&mathScore>=40&&avr>=60) {
			System.out.println("합격입니다");
		}else {
			System.out.println("불합격입니다");
		}

	}
	
	//set매서드(setter) => 필드데이터에 값을 저장하기위한 매서드
	//내 데이터에 값을 넣어주는 역할
	public void setEnscore(int tEnscore) {
		if (tEnscore<0) {
			enScore = 0;
			return;
		}
		enScore = tEnscore;
	}
	public void setKoscore(int tKoscore) {
		if (tKoscore<0) {
			koScore = 0;
			return;
		}
		koScore = tKoscore;
	}
	public void setMathscore(int tMathscore) {
		if (tMathscore<0) {
			mathScore = 0;
			return;
		}
		mathScore = tMathscore;
	}
	
	//get매서드(getter)=>필드데이터 값을 사용하기 위한 매서드
	
	public int getEnscore() {
		return enScore;
	}
	public int getKoscore() {
		return koScore;
	}
	public int getMathscore() {
		return mathScore;
	}
	public String getGender() {
		return this.gender;
	}
	public int getAge() {
		return this.age;
	}
	public String getName() {
		return this.name;
	}
	//토탈값을 반환하는 매서드
	public int getTotal() {
		return enScore+koScore+mathScore;
	}
	//평균값을 반환하는 매서드
	public float getAverage() {
		return getTotal()/3.0f;
	}
	
	//합격인지 불합격인지 결과를 출력해 주는 매서드
	public void checkPass() {
		
		if(enScore>=40&&koScore>=40&&mathScore>=40&&getAverage()>=60) {
			System.out.println("합격입니다");
		}else {
			System.out.println("불합격입니다");
		}
	}
	public boolean checkPass2() {
		
		if(enScore>=40&&koScore>=40&&mathScore>=40&&getAverage()>=60) {
			return true; //좀더 확장성 있게 만들 수 있다
		}else {
			return false;//좀더 확장성 있게 만들 수 있다
		}
	}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
	
	//displayMyInfo 매서드를 만들어 보자
	// 매개변수는 없고 
	//리턴 값도 존재하지 않는다.
	// 실행의 결과로
	//저는 ㅇㅇ살의 ㅇㅇㅇ입니다.
	//국어:ㅇㅇ점
	//영어:ㅇㅇ점
	//수학:ㅇㅇ점
	//합계:ㅇㅇ점
	//평균:ㅇㅇ점
	//으로 시험에 합격하였습니다.
	
	public void displayMyInfo() {
		System.out.println("저는 "+age+"살의 "+name+"입니다.");
		System.out.println("국어 : "+koScore +"점");
		System.out.println("영어 : "+enScore +"점");
		System.out.println("수학 : "+mathScore +"점");
		System.out.println("합계 : "+getTotal() +"점");
		System.out.println("평균 : "+getAverage() +"점");
		if(checkPass2()) {
			System.out.print("으로 시험에 합격했습니다 ");
		}else {
			System.out.print("으로 시험에 불합격했습니다");
		}
	}
	//매개변수 값과 객체의 데이터가 동일하다면 true 아니면 false를 반환
	public boolean equals(String name, int age, String gender) {
		if (this.name.equals(name)&&this.age==age&&this.gender.equals(gender)) {
			return true;
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               }
			return false;
	}
	
	
	public static void showCount() {
		System.out.println(count);
	}
}
	