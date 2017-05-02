//ЗАВДАННЯ + 
//всі об"єкти описуємо класами ( ООП )
//Створити клас Людина в ньому описати такі поля:
//- ім*я;- тип;- вік;

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

	// додати методи які б в залежності від типу людини (буде тільки два типи:
	// збирач і мисливець)робили, вивід типу людини,
	public String showType(String hunter) {
		if (humanType.equals(hunter)) {
			System.out.println("Human is hunter");
		} else {
			System.out.println("Human is gatherer");
		}
		return humanType;
	}

	// наступний метод в залежності від типу людини
	// пропонував би деякі види страв, користувач буде вводити що він хоче
	// з*їсти з
	// перерахованих страв(Scanner), якщо є співпадіння то вивести повідомлення
	// : "ім*я людини
	// + з*їсть (рандомне число) кілограм даної страви".

}
