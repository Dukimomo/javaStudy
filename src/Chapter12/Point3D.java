package Chapter12;

public class Point3D extends Point {
		private int z;

		public int getZ() { 
			return z;
		}   
		
		// this�� ���������� super ������ �ʰ� �޼��带 ȣ��

		@Override 
		public String getLocation() { 
			// TODO Auto-generated method stub
			return super.getLocation() + ", z : " + z;
		}
		
		
		
		// �������̵� : �θ� Ŭ������ ���ǵǾ��ִ� �޼��带 �ڽ� Ŭ�������� �������ϴ� ��
		
}
