package chapter2;

public class ex12 {

	public static void main(String[] args) {
		int var1;
		// 1. Ex10Ÿ���� �ν��Ͻ��� ����
		// 2. obj1 ��ü�� ����
		ex10 obj1 = new ex10();
		obj1.var1 = 10;
		obj1.var2 = 3.14;
		obj1.var3 = 'a';
		obj1.var4 = "Hello World~!";
		
		// 1. Ex11Ÿ���� �ν��Ͻ��� ����
		// 2. obj2 ��ü�� ����
		ex11 obj2 = new ex11();
		
		//obj2 ��ü�� 100, 50
		obj2.num1 = 100;
		obj2.num2 = 50;
		
		// 1. Ex13Ÿ���� �ν��Ͻ��� ����
		// 2. obj3 ��ü�� ����
		ex13 obj3 = new ex13();
		
		// obj3 ��ü���� 32, 180.6, 'A', "����Ű", "�Ｚ"�� �����ϼ���.
		obj3.num1 = 32;
		obj3.num2 = 180.6;
		obj3.var1 = 'A';
		obj3.var2 = "����Ű";
		obj3.var3 = "�Ｚ";
		
		System.out.println(obj3.num1);
		System.out.println(obj3.num2);
		System.out.println(obj3.var1);
		System.out.println(obj3.var2);
		System.out.println(obj3.var3);
		
		Student chulsu = new Student();
		chulsu.name = "��ö��";
		chulsu.age = 16;
		
		System.out.println(chulsu.name);
		System.out.println(chulsu.age);
		// ����1. Ex13 Ŭ������ �ν��Ͻ��� ����� ex13 ��ü�� �����ϼ���.
		
		// ����2. chulsu ��ü�� ����� Student Ŭ������ �ν��Ͻ��� �����ϼ���.
		// ����3. Student Ŭ������ �ν��Ͻ��� ����� student��ü�� �����ϼ���.
		Student student = new Student();
		
		System.out.println(student.name);
		System.out.println(student.name);
		
		
		
		
	}

}
