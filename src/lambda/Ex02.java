package lambda;

interface Lambda02 {
	public void lam(Object o);
}


public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lambda02 lam01 = (o)-> {
			System.out.println(o + "출력");
			System.out.println("여러줄 사용가능");
		};
		lam01.lam("안녕하세요");
	}

}
