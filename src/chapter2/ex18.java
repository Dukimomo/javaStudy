package chapter2;

public class ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student();
		student1.name = "��ȭ";
		student1.addr = "�λ걤���� �λ����� �߾Ӵ��";
		
		Student student2 = new Student();
		student2.name = "��ö��";
		student2.addr = "�λ걤���� ���� �������";
		
		Student[] studentList = new Student[5];
		
		studentList[0] = new Student();
		studentList[1] = student1;
		studentList[2] = new Student();
		studentList[3] = student2;
		studentList[4] = new Student();
		
		System.out.println("�̻� ��");
		System.out.println(studentList[3].addr);
		
		studentList[3].addr = "�λ걤���� �λ����� ������";
		
		System.out.println("�̻� ��");
	}

}
