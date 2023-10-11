package se.iths.Uppgifter.JavaLambda;

import java.util.function.Predicate;

public class Exc2 {
    public static void main(String[] args) {
        //Med eget interface
        CheckString check = s -> s.isEmpty();
        System.out.println(check.emptyString(""));
        //Färdig interface för att testa objekt
        Predicate<String> isEmptyStr = s -> s.isEmpty();
        System.out.println(isEmptyStr.test(""));
    }
}
interface CheckString{
    boolean emptyString(String s);
}
