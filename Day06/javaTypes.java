public class javaTypes {

	public static void main(String[] args) {

		// �з�		�ڷ���		���

		// ������		int (�⺻��)	10����, 8����, 16���� 
		// ������   	long 		32000L (���� �ڿ� L�� ����) -2^63 ~ 2^63-1
		// ������		short		-32.768 ~ 32.767
		// ������		byte 		-128 ~ 127

		// �Ǽ���		float		(+,-)1.4E-45 ~ 3.4028235E38 (���ڵڿ� F�� ����)
		// �Ǽ��� 		double(�⺻��)	(+,-)4.9E-324 ~ 1.7976931348623157E308 -> float���� ���� ���� 
						 
		// ���ڿ�		String 		ū ����ǥ�� ǥ��
		// ���� 		char 		���� ����ǥ�� �ѱ��ڸ� ǥ��
		// �ο� 		boolean		true, false

		//������
		int intValue = 0;
		int num01 = 10;		// 10���� 10 ǥ��
		int num02 = 010;		// 8���� 8 ǥ��
		int num03 = 0x10;		// 16���� 16 ǥ��
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
		
		// �Ǽ���
		float fvalue = 3.14F;
		double dValue = 256.12;

		System.out.println(fvalue);
		System.out.println(dValue);

		// ������
		String stringValue = "�ȳ��ϼ���.";
		String bye = "�ȳ��� �輼��.";
		
		System.out.println(stringValue);
		System.out.println(bye);

		// ����
		char char01 = 'A';
		System.out.println(char01);

		// �ο� ������Ÿ���� �ƴϰ� ��,���� �ǹ�. 
		// �Ǿտ� String Ÿ���� �ͼ� �ڿ��� �ڵ����� ���ڿ��� �ٲ� 
		boolean istrue01 = true;
		boolean isfalse01 = false;
		System.out.println("" + istrue01 + 10);
		System.out.println(isfalse01);

 		boolean result1 = 1 == 2;
 		boolean result2 = 1 != 2;
		System.out.println(result1);
		System.out.println(result2);

		boolean isEqualNumber = 10 == 11;
		boolean isEqualType = "��찳" == "��찳";
		boolean isEqualName = "����" == "������";
		if (isEqualNumber && isEqualType && isEqualName) {

		}

		// ����ȯ  
		byte byteRes = (byte)128; 		// int���� ������ byte Ÿ������ ����  --> ��� -128
		System.out.println(byteRes);		// -128~127�������� ������ �ٽ� -128�� ���ư� 

		short shortRes = (short)32768;	// int���� ������ short Ÿ������ ����
		System.out.println(shortRes);	

		float floatVal01 = 12.34F;
		int intVal01 = (int)floatVal01;		// float(�Ǽ�) -> int(����) ����ȯ. �Ҽ��� ���ڸ� ���� 
		System.out.println(intVal01);	

		int charNum = 'A';			// char -> int ����ȯ
		System.out.println(charNum);		// 'A' -> 65, 'B'->66���� ���� 


	}
}