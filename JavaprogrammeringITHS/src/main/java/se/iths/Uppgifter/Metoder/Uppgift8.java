package se.iths.Uppgifter.Metoder;

public class Uppgift8 {
    public static void main(String[] args) {
        try{
            System.out.println(iGiveYouYearYouGiveMeNumber("2050-07-36"));
        }catch (NumberFormatException e){
            System.out.println("WRONG! WRONG! WRONG! Idiot!");
        }
    }
    public static int iGiveYouYearYouGiveMeNumber(String yearOfYourDeath){
        String[] split = yearOfYourDeath.split("-");
        return Integer.parseInt(split[0]);
    }
}
