package se.iths.Forelasningar.notes.DemoFunktionellProgrammering;

import java.util.function.Function;

public class FunctionalDemo {
    public static void main(String[] args) {
        final String[] replaceWith = {"x"};
        Function<String, String> function = s -> s.replace("s",replaceWith[0]);
       //System.out.println(function.apply("TtTeSSSt"));
        replaceWith[0] = "l";
        higherOrderFunction(function);
    }

    public static void higherOrderFunction(Function<String,String> functionAsParameter){
        System.out.println(functionAsParameter.apply("Test"));
    }
}
