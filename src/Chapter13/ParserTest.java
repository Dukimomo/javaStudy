package Chapter13;

public class ParserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parseable parser = ParserManager.getParser("korean");
		parser.parse("�ѱ������̵���ִ� ����.pdf");
		
		parser = ParserManager.getParser("english");
		parser.parse("���������̵���ִ� ����.pdf");
	} 
}
