package Java;

public class Person {
    //my data fields or instance variables
    private String name;
    private double weight;
    private double height;

 
    //I created a parametized constructor to accept the instance varibles i created earlier
    public Person(String name,double weight,double height){
        this.name=name;
        this.weight=weight;
        this.height=height;
    }


        //my Accessors and mutators methods for my instance variables
    public void setName(String name) {
        this.name = name;
    }


    public void setWeight(double weight) {
        this.weight = weight;
    }


    public void setHeight(double height) {
        this.height = height;
    }


    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    

    //Methods


    //Created a method to calculate the BMI so i can later reuse this block of code in another class
    double BMI;
    public double calculateBMI(){
        BMI= weight/(height*height);
        return BMI;
    }



    //i created another method to categorize the calculated BMIs and displays the name of the individuals who are Underweight or Obese (The bonus part of the question )
    public String getBMICategory(){
        if(BMI <18.5){

            return "(Underweight) -  " +name;
            
        }
        else if (BMI >= 18.5 && BMI < 25 ){
           
            return "(Normal weight)";
        }
        else if(BMI>=25 && BMI<30){
            
            return "(Overweight)";
        }
        else {
            return "(Obese) -  " + name;
        }
    }

    
}



