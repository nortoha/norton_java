package MadLibs;

import java.util.Scanner;

public class MadLibs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to MadLibs!");
		System.out.println();
		System.out.print("Enter an adjective: ");
		String adjective = sc.nextLine();
		System.out.print("Enter a name: ");
		String name = sc.nextLine();
		System.out.print("Enter an emotion: ");
		String emotion = sc.nextLine();
		System.out.print("Enter a verb: ");
		String verb = sc.nextLine();
		System.out.print("Enter a noun: ");
		String noun = sc.nextLine();
		System.out.print("Enter a past tense verb: ");
		String pastTenseVerb = sc.nextLine();
		System.out.println("/nHere is your MadLibs story:");
		System.out.print("Once upon a time in a far off place, there lived a " + adjective + " man by the name of "
				+ name + ".");
		System.out.println(
				" Now " + name + " was a " + emotion + " fellow because he had to " + verb + " a " + noun + ".");
		System.out.println("He did not to want to, so instead, he " + pastTenseVerb
				+ " and disappeared. Nobody ever heard from him again. /nThe end.");
		sc.close();
	}
}