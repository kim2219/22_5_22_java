
public class main {

	public static void main(String[] args) {
		Book[] bookArr = new Book[5];
		bookArr[0] = new Book("�츮����", "J.K �Ѹ�");
		bookArr[1] = new Book("���Ƕ� �����ΰ�", "����ũ ����");
		bookArr[2] = new Book("Do it java ���α׷���", "������");
		bookArr[3] = new Book("�����","�����㺣��");
		bookArr[4] = new Book("���̺θ��� ���̵�","������");
		
		for(int i = 0; i <  bookArr.length; i++) {
		
			System.out.println("å�̸�" + bookArr[i].getBookName());
			System.out.println("����" + bookArr[i].getAuthor());
		}

	}

}
