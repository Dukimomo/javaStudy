package Chapter13;

// �� ���� �����⸦ ������ִ� Ŭ����
public class ParserManager {
	public static Parseable getParser(String type) {
		if(type.equals("Korean")) {
			return new KoreanParser();
	} else {
		return new EnglishParser();
	}

}
}
