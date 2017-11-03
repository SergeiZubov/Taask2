package by.home.dz.zadacha.a.customer;

/*Создать массив объектов. Вывести:
a) список покупателей в алфавитном порядке;
b) список покупателей, у которых номер кредитной карточки находится
в заданном интервале.*/
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Customer[] customer = new Customer[6];

		customer[0] = new Customer(1,"Zubov", "Sergei", "Andreevich","Minsk",10,10);
		customer[1] = new Customer(2,"Zubov", "Igor", "Andreevich","Borisov",12,12);
		customer[2] = new Customer(3,"Zubova", "Natalia", "Timofeevna","Minsk",32,32);
		customer[3] = new Customer(4,"Turov", "Viktor", "Olegovich","Vitebsk",50,50);
		customer[4] = new Customer(5,"Turkina", "Irina", "Vladimirovna","Stolin",21,21);
		customer[5] = new Customer(6,"Arturov", "Viktor", "Olegovich","Zhlobin",13,13);
		
		//Создаю массив строк
		String[] array = new String[customer.length];
		//Привожу имеющийся массив к массиву строк
		for (int i = 0; i < array.length; i++) {
			array[i] = customer[i].getFaminiya() + " " + customer[i].getImya() + " " + customer[i].getOtchestvo();
			//System.out.println(array[i]); - можно удалить(нужен только для проверки работает ли схема
		}
		
		//System.out.println();перенос строки
		
		//Я хочу отсортирвать в алфавитном порядке, и оно каким-то образом это делает
		Arrays.sort(array);
		
		/*проверяю, что натворил Arrays.sort()
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);			
		}*/
		
		//System.out.println();перенос строки
		
		//мутная схема, но работает
		System.out.println("Значения в алфавитнм порядке:");
		for (int i = 0; i < array.length; i++) {
			for (int j=0;j<array.length;j++) {
				if (array[i].equals((customer[j].getFaminiya()+" "+customer[j].getImya()+" "+customer[j].getOtchestvo()))){
					System.out.println(customer[j].toString());
				}
			}
			}
		System.out.println("\nНомер счёта в заданном диапазоне: ");
		for (int i=0;i<customer.length;i++) {
			if (10<customer[i].getNomerKarti()&&customer[i].getNomerKarti()<32) {
				System.out.println(customer[i].toString());
			}
		}
	}
}
