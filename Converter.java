public class Converter{
    public static void main(String[] args) {
        int myInt = 100;
        double myDouble = 100.50;
        char myChar = 'C';

        long convertedLong = myInt;
        int convertedInt = (int) myDouble;  
        char convertedChar = (char) myInt;  

        System.out.println("myInt = " + myInt);
        System.out.println("myDouble = " + myDouble);
        System.out.println("myChar = " + myChar);

        System.out.println("convertedInt = " + convertedInt);
        System.out.println("convertedChar = " + convertedChar);
        System.out.println("convertedLong = " + convertedLong);
    }

}