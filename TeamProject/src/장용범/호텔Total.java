package ����;

import Reference.Main;
import Reference.Ticket;

public class ȣ��Total implements ȣ�ڿ��� {

	// �ʵ�
	
	// ������
	
	// �޼ҵ�
	@Override
	public void ������() {
		System.out.println("*** ���� ��� �Ϸ� ***");
	}
	@Override
	public void �������() {
		System.out.println("*** ���� ��� �Ϸ� ***");
	}
	@Override
	public void ���ο�����ȸ() {
		System.out.println("*** ���ο�����ȸ ***");
	}
	@Override
	public void ��ü������Ȳ() {
		System.out.println("*** ��ü ������Ȳ ��ȸ ***");
		for (ȣ��Total temp : TestMain.ȣ��Totals) {
			System.out.println(temp);
		}
	}
	@Override
	public void ����ó��() {
		System.out.println("*** ����ó�� ***");
	}
	
	
}
