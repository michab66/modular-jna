package biz.dsuk.jar;

import com.sun.jna.ptr.IntByReference;

public class Main {

    public static void main(String[] args) {
		
		// Activate JNA tracing.
		System.setProperty( "jna.debug_load", "true" );
		
        System.out.printf("Hello from %s%n", Main.class.getName());

		// Test using GSON
        Person person = new Person("Michael", 58);
        System.out.printf("Person: %s%n", person);
        System.out.printf("JSON: %s%n", person.toJSON());
        System.out.printf("Reconstituted Person: %s%n", Person.fromJSON(person.toJSON()));        

		// Test using JNA
        IntByReference ibr = new IntByReference(51773);
        System.out.printf("IntByReference=%d%n", ibr.getValue());
    }
}
