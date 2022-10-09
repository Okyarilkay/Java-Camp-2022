
public class main {

	public static void main(String[] args) {
		// StringsDemo

				String message = "The weather is nice today.";

				System.out.println("number of elements: " + message.length());
				System.out.println("5th element: " + message.charAt(4));

				System.out.println(message.concat(" wonderful!"));

				System.out.println(message.startsWith("T"));

				System.out.println(message.endsWith("."));

				char[] characters = new char[5];
				message.getChars(0, 5, characters, 0);
				System.out.println(characters);

				System.out.println(message.indexOf('a'));

				System.out.println(message.lastIndexOf('e'));

				String newMessage = message.replace(" ", "-");// replace
				System.out.println(newMessage);
				System.out.println(message.substring(2));
				System.out.println(message.substring(2, 10));
				for (String kelime : message.split(" ")) {
					System.out.println(kelime);
				}
				System.out.println(message.toLowerCase());
				System.out.println(message.toUpperCase());
				System.out.println(message.trim());


	}

}
