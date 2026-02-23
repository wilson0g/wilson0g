package Java;

// BMITracker class and my main method
public class BMITracker {
    public static void main (String[] args){
        //creating instances of the person class
        Person person1= new Person("Wilson", 47,1.35);
        Person person2= new Person("Emmanuel", 55,1.75);
        Person person3= new Person("David", 68,1.57);
        Person person4= new Person("Kelvin", 75,1.35);
        Person person5= new Person("Ekow", 80,1.95);
        Person person6= new Person("Yvette", 57,1.35);
        Person person7= new Person("Rhoda", 77,1.85);
        Person person8= new Person("Sena", 67,1.50);
        Person person9= new Person("Selorm", 62, 1.63);
        Person person10= new Person("Olivia", 69, 1.52);
        Person person11= new Person("Ebo", 73, 1.83);
        Person person12= new Person("Elikem", 60, 1.63);
        Person person13= new Person("Ezekiel", 81, 1.83);
        Person person14= new Person("Golloh", 67, 1.8);
        Person person15= new Person("Nicole", 51, 1.72);
        Person person16= new Person("Budali", 55, 1.67);
        Person person17= new Person("Kevin", 56, 1.98);
        Person person18= new Person("Winston", 64, 1.55);
        Person person19= new Person("Albert", 69, 1.89);
        Person person20= new Person("Aaron", 52, 1.81);


        double bmiValue1=person1.calculateBMI();
        double bmiValue2=person2.calculateBMI();
        double bmiValue3=person3.calculateBMI();
        double bmiValue4=person4.calculateBMI();
        double bmiValue5=person5.calculateBMI();
        double bmiValue6=person6.calculateBMI();
        double bmiValue7=person7.calculateBMI();
        double bmiValue8=person8.calculateBMI();
        double bmiValue9=person9.calculateBMI();
        double bmiValue10=person10.calculateBMI();
        double bmiValue11=person11.calculateBMI();
        double bmiValue12=person12.calculateBMI();
        double bmiValue13=person13.calculateBMI();
        double bmiValue14=person14.calculateBMI();
        double bmiValue15=person15.calculateBMI();
        double bmiValue16=person16.calculateBMI();
        double bmiValue17=person17.calculateBMI();
        double bmiValue18=person18.calculateBMI();
        double bmiValue19=person19.calculateBMI();
        double bmiValue20=person20.calculateBMI();


        //creating array
        double[] bmiDatabase={bmiValue1, bmiValue2, bmiValue3, bmiValue4, bmiValue5, bmiValue6, bmiValue7, bmiValue8, bmiValue9, bmiValue10, bmiValue11, bmiValue12, bmiValue13, bmiValue14, bmiValue15, bmiValue16, bmiValue17, bmiValue18, bmiValue19, bmiValue20};
        

        //Displaying BMI values
        System.out.println(" ");
        System.out.println(" ");
        

        System.out.println("=== ASHESI HEALTH TRACKER ===");
        System.out.println(" ");

        System.out.println("BMI DATABASE VALUES:");
        System.out.println("---------------------");
        System.out.println("1. "+bmiValue1 + " " + person1.getBMICategory() );
        System.out.println(" ");

        System.out.println("2. "+bmiValue2 + " " + person2.getBMICategory() );
        System.out.println(" ");

        System.out.println("3. "+bmiValue3 + " " + person3.getBMICategory() );
        System.out.println(" ");

        System.out.println("4. "+bmiValue4 + " " + person4.getBMICategory() );
        System.out.println(" ");

        System.out.println("5. "+bmiValue5 + " " + person5.getBMICategory() );
        System.out.println(" ");

        System.out.println("6. "+bmiValue6 + " " + person6.getBMICategory() );
        System.out.println(" ");

        System.out.println("7. "+bmiValue7 + " " + person7.getBMICategory() );
        System.out.println(" ");

        System.out.println("8. "+bmiValue8 + " " + person8.getBMICategory() );
        System.out.println(" ");

        System.out.println("9. "+bmiValue9 + " " + person9.getBMICategory() );
        System.out.println(" ");

        System.out.println("10. "+bmiValue10 + " " + person10.getBMICategory() );
        System.out.println(" ");

        System.out.println("11. "+bmiValue11 + " " + person11.getBMICategory() );
        System.out.println(" ");

        System.out.println("12. "+bmiValue12 + " " + person12.getBMICategory() );
        System.out.println(" ");

        System.out.println("13. "+bmiValue13 + " " + person13.getBMICategory() );
        System.out.println(" ");

        System.out.println("14. "+bmiValue14 + " " + person14.getBMICategory() );
        System.out.println(" ");

        System.out.println("15. "+bmiValue15 + " " + person15.getBMICategory() );
        System.out.println(" ");

        System.out.println("16. "+bmiValue16 + " " + person16.getBMICategory() );
        System.out.println(" ");

        System.out.println("17. "+bmiValue17 + " " + person17.getBMICategory() );
        System.out.println(" ");

        System.out.println("18. "+bmiValue18 + " " + person18.getBMICategory() );
        System.out.println(" ");

        System.out.println("19. "+bmiValue19 + " " + person19.getBMICategory() );
        System.out.println(" ");

        System.out.println("20. "+bmiValue20 + " " + person20.getBMICategory() );
        System.out.println(" ");





            

        //Displaying analysis results
        System.out.println(" ");
        System.out.println("ANALYSIS RESULTS:");
        System.out.println("-------------------");



        //calculating average bmi value
        double sum=0;
        for(int i=0; i<bmiDatabase.length; i++){
            sum = sum + bmiDatabase[i];
        }
        double average = sum/bmiDatabase.length;
        System.out.printf("Average BMI value: " + "%.2f", average);
        System.out.println(" ");

        System.out.println(" ");


        //Calculating the largest BMI 
        double max = bmiDatabase[0];
        for (int i=0; i<bmiDatabase.length; i++){
            if (max<bmiDatabase[i]){
                max = bmiDatabase[i];
            } 
        }
        System.out.printf("Largest BMI value: " + "%.2f", max );

        System.out.println(" ");

        System.out.println(" ");

        
        //Calculating the lowest BMI value
        double min = bmiDatabase[0];
        for (int i=0; i<bmiDatabase.length; i++){
            if (min>bmiDatabase[i]){
                min = bmiDatabase[i];
            } 

                 
        }

        //display the min BMIvalue. 
            System.out.printf("Lowest BMI value: " + "%.2f", min);

            

        System.out.println(" ");
        System.out.println(" ");


        
        // Sorting the array
        for (int i=0; i<bmiDatabase.length -1 ; i++){
            for(int m =0; m< bmiDatabase.length -i -1; m++ ){
                if (bmiDatabase[m] > bmiDatabase[m+1]){
                double oli = bmiDatabase[m];
                bmiDatabase[m] = bmiDatabase[m+1];
                bmiDatabase[m+1] = oli;
                }
            }   
        }

        //Displaying the sorted BMI values

        System.out.println(" ");
        System.out.println("SORTED BMI VALUES (Ascending)");
        System.out.println("------------------------------");
        for (int i=0; i<bmiDatabase.length ; i++){
            System.out.printf(  "  %.2f",+bmiDatabase[i] ); 

        } 


        // Declaring and intializing my variables
        int obeseSum = 0;
        int UnderweightSum = 0;
        int NormalweightSum = 0;
        int OverweightSum = 0;

        for(int i =0; i<bmiDatabase.length; i++){
            if (bmiDatabase[i]<18.5){
                UnderweightSum = UnderweightSum + 1;
            }

            else if (bmiDatabase[i] > 18.4 && bmiDatabase[i]< 25 ){
            NormalweightSum = NormalweightSum + 1;
            }

            else if (bmiDatabase[i] > 24.9 && bmiDatabase[i]< 30){
            OverweightSum = OverweightSum + 1;
            }

            else {

                obeseSum = obeseSum + 1;
            }
        
        }

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");


        System.out.println(+ UnderweightSum + " People fall under the Underweight category");
        System.out.println(" ");
        System.out.println(+ NormalweightSum + " People fall under the Normal weight category");
        System.out.println(" ");
        System.out.println(+ OverweightSum + " People fall under the Overweight category");
        System.out.println(" ");
        System.out.println(+ obeseSum + " People fall under the Obese category");
    
    }
}
   
    


