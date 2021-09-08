import java.util.Scanner;

/*
 * La classe String fornisce un metodo compareTo che riceve come argomento un'altra stringa. Il metodo torna
 * un int. Se torna 0 le 2 stringhe sono uguali. Se torna un valore minore di 0 la stringa che esegue il
 * metodo e più piccola in ordine lessicografico. Se torna un valore superiore a 0 la stringa che esegue
 * il metodo è più grande in ordine lessicografico. Scrivete un applicazione che lette 2 stringhe le ordini
 * sia in modo alfabetico e dopo di lunghezza
 */
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Inserire la prima stringa ");
		String s1 = input.nextLine();
		System.out.print("Inserire la seconda stringa ");
		String s2 = input.nextLine();
		System.out.println("Ordine alfabetico:");
		if(s1.compareTo(s2) == 0 || s1.compareTo(s2) < 0) {
			System.out.println(s1);
			System.out.println(s2);
		} else {
			System.out.println(s2);
			System.out.println(s1);
		}
		System.out.println("Ordine di lunghezza:");
		if(s1.length() == s2.length() || s1.length() < s2.length()) {
			System.out.println(s1);
			System.out.println(s2);
		} else {
			System.out.println(s2);
			System.out.println(s1);
		}
	}
}
