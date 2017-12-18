public class javaTypes {

	public static void main(String[] args) {

		// 분류		자료형		상수

		// 정수형		int (기본값)	10진수, 8진수, 16진수 
		// 정수형   	long 		32000L (숫자 뒤에 L을 붙임) -2^63 ~ 2^63-1
		// 정수형		short		-32.768 ~ 32.767
		// 정수형		byte 		-128 ~ 127

		// 실수형		float		(+,-)1.4E-45 ~ 3.4028235E38 (숫자뒤에 F를 붙임)
		// 실수형 		double(기본값)	(+,-)4.9E-324 ~ 1.7976931348623157E308 -> float보다 범위 넓음 
						 
		// 문자열		String 		큰 따옴표로 표기
		// 문자 		char 		작은 따옴표로 한글자만 표기
		// 부울 		boolean		true, false

		//정수형
		int intValue = 0;
		int num01 = 10;		// 10진수 10 표기
		int num02 = 010;		// 8진수 8 표기
		int num03 = 0x10;		// 16진수 16 표기
		byte bNum01 = -128;
		short sNum01 = -32768;
		long lNum01 = -2147483648L;

		System.out.println(intValue);
		System.out.println(num01);
		System.out.println(num02);
		System.out.println(num03);
		System.out.println(bNum01);
		System.out.println(sNum01);
		System.out.println(lNum01);
		
		// 실수형
		float fvalue = 3.14F;
		double dValue = 256.12;

		System.out.println(fvalue);
		System.out.println(dValue);

		// 문자형
		String stringValue = "안녕하세요.";
		String bye = "안녕히 계세요.";
		
		System.out.println(stringValue);
		System.out.println(bye);

		// 문자
		char char01 = 'A';
		System.out.println(char01);

		// 부울 문자형타입이 아니고 참,거짓 의미. 
		// 맨앞에 String 타입이 와서 뒤에도 자동으로 문자열로 바뀜 
		boolean istrue01 = true;
		boolean isfalse01 = false;
		System.out.println("" + istrue01 + 10);
		System.out.println(isfalse01);

 		boolean result1 = 1 == 2;
 		boolean result2 = 1 != 2;
		System.out.println(result1);
		System.out.println(result2);

		boolean isEqualNumber = 10 == 11;
		boolean isEqualType = "삽살개" == "삽살개";
		boolean isEqualName = "해피" == "누렁이";
		if (isEqualNumber && isEqualType && isEqualName) {

		}

		// 형변환  
		byte byteRes = (byte)128; 		// int형을 강제로 byte 타입으로 변경  --> 결과 -128
		System.out.println(byteRes);		// -128~127까지여서 끝나면 다시 -128로 돌아감 

		short shortRes = (short)32768;	// int형을 강제로 short 타입으로 변경
		System.out.println(shortRes);	

		float floatVal01 = 12.34F;
		int intVal01 = (int)floatVal01;		// float(실수) -> int(정수) 형변환. 소수점 뒷자리 버림 
		System.out.println(intVal01);	

		int charNum = 'A';			// char -> int 형변환
		System.out.println(charNum);		// 'A' -> 65, 'B'->66으로 연결 


	}
}