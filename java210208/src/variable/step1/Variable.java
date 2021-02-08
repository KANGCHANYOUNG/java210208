package variable.step1;

public class Variable {
  // 선언부
 // 메소드 선언
	void methodA(int x) {
		
	}
	double methodB(int x) { //x는 지변 밖에서는 사용불가
		return 3.14;
	}
	
	
	
	// 메인 메소드 - exe파일로 만들 수 있어요.
	/*
	 * 
	 * 문제해결능력 키움
	 * @return void이다. - 비어있다. - 돌려 받을 수 있는 값이 없다. - 이것 때문에 에러가 발생할 수도 있다.
	 * @param args
	 */
	public static void main(String[] args) {
		// System: 너의 컴터 out 속성 : 출력장치( 하드웨어 - 모니터, 프린터..) , print(), print(int t), print (double pi) print (String 안녕)ㄴ
		//print메소드는 여러개이다. 같은 이름의 메소드를 여러개 만들 수도 있다.
		//메소드 선언할 떄는 좌중괄호 우중괄호를 사용하고ㅗ...
		// 메소드를 호출할때는;
		//남의 생각 약속 규범은 API, XXX.jar, 이 안(클래스[소스가 만들어졌으니 구체적이다]안에 객체[결정되지 않았다.Sonata.java, class Sonata{}]안에)에 있는 것을 꺼내쓴다.
		//System.out.print(); //줄바꿈 안됨
		// SELECT 이름 FROM 회원 집합
		// WHERE-->는 조건문 아이디='test'
		//AND--> 교집합이야? 비번='123'
		
		Variable v = new Variable();
		
		System.out.print(5); //줄바꿈 안됨, 메소드를 호출할 수 있니?
		System.out.print(v.methodB(1)); //줄바꿈 안됨
		System.out.print(v.methodA(1)); //줄바꿈 안됨
		System.out.print(1+"  "+1); //줄바꿈 안됨
		System.out.print(10+ "10"); //줄바꿈 안됨
		System.out.println(); // 줄바꿈 추가
	}

}
