package biz.dsuk.jar;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sun.jna.ptr.IntByReference;

public final class Person {

    public String name;
    public int age;
    
    public Person() {
        this("", 0);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        IntByReference pProp = new IntByReference(51773);
        age = pProp.getValue();
        return "Person[name:" + name + ", age:" + age + "]";
    }

    public String toJSON() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(this);
    }

    public static Person fromJSON(String jsonString) {
        Gson gson = new Gson();
        return gson.fromJson(jsonString, Person.class);
    }
}
