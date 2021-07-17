
class ThisExam {
	int number;
	String name;
//	public ThisExam (int n1, String n2) {
//		n1 = number;
//		n2 = name;
//	}
	// 윗처럼 n1, n2 같은 변수를 쓰면서 필드에 값을 넣을 수 있지만 헷갈리며 실수를 만들 수도 있다
	
//	public ThisExam (int number, String name)  {
//		name = name;
//		number = number;
//	}
	// 그렇기에 보통 number필드에 넣는 값은 변수명은 number, name필드에 넣는 값은 변수명은 name으로 짓는게 좋다
	// 하지만 그렇게하면 compiler가 똑같은 변수명을 사용하는 것으로 알아들어 가장 가깝게 선언된 변수를 따르게 된다
	
	public ThisExam (int number, String name) {
		this.name = name;
		this.number = number;
	}
	// this keyword를 사용하면 그 객체 것의라는 것을 의미한다. 그렇기에 this.name이나 this.number를 쓰게된다면 그 객체 속의 필드것이라는 것을 의미한
	// this keyword는 위처럼 필드뿐만 아니라 또 메소드나 생성자에도 해당이 되니 쓸 수 있다.
	
	public static void main(String[] args) {
		ThisExam t1 = new ThisExam(15, "Kate");
		System.out.println(t1.name);
		System.out.println(t1.number);		
	}

}
