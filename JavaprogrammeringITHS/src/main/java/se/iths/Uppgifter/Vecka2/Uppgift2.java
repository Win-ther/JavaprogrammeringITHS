package se.iths.Uppgifter.Vecka2;

public class Uppgift2 {
    public static void main(String[] args) {
        System.out.println(passwordOk("Etthundratusen5"));
        System.out.println(passwordOk("Ettdd()hun!!dra22%%%&&33"));
        System.out.println(passwordOk("Etthundraaaa"));
        System.out.println(passwordOk("555544446666"));
        System.out.println(passwordOk("Etthundratusen54"));


    }
    public static boolean passwordOk(String password){
            return password.matches("[a-zA-Z0-9]*") && password.length() >= 10 && password.replaceAll("[0-9]","").length()+1 < password.length();
    }
}
