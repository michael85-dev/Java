package string;

public class StringTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String javaStr = new String("java");
		String androidStr = new String("android");
		
		System.out.println(javaStr);
		System.out.println("ó�� ���ڿ� �ּ� ��: " + System.identityHashCode(javaStr));
		
		javaStr = javaStr.concat(androidStr); //���ڿ� javaStr���ٰ� androidStr�� �����Ͽ� javaStr�� ����
		
		System.out.println(javaStr);
		System.out.println("����� ���ڿ� �ּ� �� : " + System.identityHashCode(javaStr));

	}

}
