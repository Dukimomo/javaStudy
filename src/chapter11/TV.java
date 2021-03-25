package chapter11;

public class TV {
	// �ܺη� �����ϸ� �ȵǴ� �����͸� ���ߴ� ���� ĸ��ȭ, ��������
	private String color;
	private boolean power;
	private int channel;
	private int volumn; 
	private int hour;
	private int minute;
	private int second;
	
	public TV() {
		color = "����";
		power = false;
		channel = 1;
	}
	
	// ��ü������ �����͵��� ���� ���� ��ü�� �����ؾ��ϰ�
	// ��ü�� �����ϴ� ����� �����ؾ��ϹǷ�
	// ������Ʈ ���� �Ⱓ�� ������� ������ ����
	// ������Ʈ�� �Ը� Ŀ���� ���� ��������
	// ������Ʈ�� ��ü���������� ����� ���踦 �صθ�
	// �������� �ӵ��� ������ ��������.
	
	// ���ν��������� �����͸� �����ϸ� �ǹǷ�
	// ������Ʈ ���� �Ⱓ�� ��������� ª�� ������ ����
	// ������Ʈ�� �Ը� Ŀ���� �����Ͱ� �Ź���ó�� ������ ���ǹǷ�
	// �������� �ӵ��� ������ ��������.
	
	// setter -> private ���� �������� ��� ������ ���ϴ� ���� �����ؾ��� �� �ʿ��� �޼���
	public void setColor(String color) {
		// TV�� �÷��� red, blue�� �����ϴ�.
		if(color.equals("red") || color.equals("blue")) {
			this.color = color;
		} else {
			System.out.println("�÷��� ����� ��縸 �˴ϴ�.");
		}
		this.color = color;
	}
	
	
	
	public void setPower(boolean power) {
		this.power = power;
	}



	public void setChannel(int channel) {
		this.channel = channel;
	}



	public void setVolumn(int volumn) {
		this.volumn = volumn;
	}



	public void setHour(int hour) {
		this.hour = hour;
	}



	public void setMinute(int minute) {
		this.minute = minute;
	}



	public void setSecond(int second) {
		this.second = second;
	}



	public String getColor() {
		return color;
	}
	
	public boolean getPower() {
		return power;
	}
	
	public int getChannel() {
		return channel;
	}
	
	// ���� �޼��� - �ѹ��� �ϳ��� ��ɸ� �����ϴ� �޼���
	// 1. ������ �Ѱ�
	// 2. ���� ä�� ��ȣ�� �˷��ش�.
	public void power() {
		power = !power;
	
		if(power) {
			System.out.println("������ �׽��ϴ�");
			
			showChannel();
		} else {
			System.out.println("������ �����ϴ�");
		}
	}
	
	public void channelup() {
		channel++;
		
		showChannel(); 
	}
	
	public void channeldown() {
		channel--;
		
		showChannel();
	}
	
	// channelUP / Down �޼��带 ���� �޼���
	private void showChannel() {
		System.out.println("���� ä�ι�ȣ��" + channel + "���Դϴ�.");
	}

	public int getVolumn() {
		return volumn;
	}

	public int getHour() {
		return hour;
	}

	public int getSecond() {
		return second;
	}

	public int getMinute() {
		return minute;
	}
} 
