package se.iths.Uppgifter.Vecka1;

public class Uppgift5 {
    public static void main(String[] args) {
        if(args.length != 3){
            System.out.println("Felaktigt antal argument. Programmet avslutas.");
            System.exit(0);
        }
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            try{
                if (Integer.parseInt(args[i]) >=0 && Integer.parseInt(args[i]) <= 9){
                    numbers[i] = Integer.parseInt(args[i]);
                }
            } catch (NumberFormatException e){
                System.out.println(args[i]+" är inte ett heltal, ersätter med 0.");
                numbers[i] = 0;
            }
        }
        int max = numbers[0];
        for (int i = 0; i < 3; i++) {
            System.out.println("You entered: "+numbers[i]);
            if (max < numbers[i])
                max = numbers[i];
        }
        System.out.println("Biggest number: "+max);
        /*Scanner scanner = new Scanner(System.in);
        int[] arr =  new int[3];
        System.out.println("Enter three integers");
        String test;
        for (int i = 0; i < 3; i++) {
            test = scanner.next();
            if (!test.contains("0") && !test.contains("1") && !test.contains("2") && !test.contains("3") && !test.contains("4") && !test.contains("5") && !test.contains("6") && !test.contains("7") && !test.contains("8") && !test.contains("9")){
                continue;
            }else if(Integer.parseInt(test)>=0 && Integer.parseInt(test) <= 9){
                arr[i] = Integer.parseInt(test);
            }
        }
        */


        /*int max = arr[0];
        for (int i = 0; i < 3; i++) {
            System.out.println("You entered: "+arr[i]);
            if (max < arr[i])
                max = arr[i];
        }
        System.out.println("Biggest number: "+max);*/

    }
}
