package se.iths.Uppgifter.Vecka2;

public class Uppgift3 {
    public static void main(String[] args) {
        String palindrome = "AbBa";
        palindrome = palindrome.toLowerCase();
        String palindrome2 = "Traktor";
        palindrome2 = palindrome2.toLowerCase();

        System.out.println(isPalindrome(palindrome));
        System.out.println(isPalindrome(palindrome2));
        System.out.println(isPalindrome(1551));
        System.out.println(isPalindrome(1234));
    }
    public static boolean isPalindrome(String palindrome){
        return isPalindrome(0, palindrome.length()-1, palindrome);
    }
    public static boolean isPalindrome(int palindrome){
        String palindromeToString = String.valueOf(palindrome);
        return isPalindrome(0, palindromeToString.length()-1, palindromeToString);
    }
    public static boolean isPalindrome(int firstIndex, int lastIndex, String palindrome){
        if(firstIndex >= lastIndex)
            return true;
        else if (palindrome.charAt(firstIndex) != palindrome.charAt(lastIndex))
            return false;
        return isPalindrome(firstIndex+1,lastIndex-1,palindrome);
    }
    public static boolean isPalindromeNotRecursive(String palindrome){
        StringBuilder palin = new StringBuilder();
        palin.append(palindrome);
        palin.reverse();

        return palin.toString().equals(palindrome);
    }

}
