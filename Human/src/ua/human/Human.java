//�������� + 
//�� ��"���� ������� ������� ( ��� )
//�������� ���� ������ � ����� ������� ��� ����:
//- ��*�;- ���;- ��;

package ua.human;

public class Human {

	private String name;
	private String humanType;
	private int age;

	public Human(String name, String type) {
		this.name = name;
		this.humanType = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String gethumanType() {
		return humanType;
	}

	public void sethumanType(String humanType) {
		this.humanType = humanType;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// ������ ������ �� � � ��������� �� ���� ������ (���� ����� ��� ����:
	// ������ � ���������)������, ���� ���� ������,
	public String showType(String hunter) {
		if (humanType.equals(hunter)) {
			System.out.println("Human is hunter");
		} else {
			System.out.println("Human is gatherer");
		}
		return humanType;
	}

	// ��������� ����� � ��������� �� ���� ������
	// ���������� �� ���� ���� �����, ���������� ���� ������� �� �� ����
	// �*���� �
	// ������������� �����(Scanner), ���� � ��������� �� ������� �����������
	// : "��*� ������
	// + �*���� (�������� �����) ������� ���� ������".

}
