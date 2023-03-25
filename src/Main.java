import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

//        int numberA = 10;
//        int numberB = 10;
//
//        if (numberA>numberB){
//            System.out.println(numberA+numberB);
//        } else if (numberB>numberA){
//            System.out.println(numberB-numberA);
//        } else {
//            System.out.println(numberA*numberB);
//        }


//        int taskTwoValueA = 12;
//        int taskTwoValueB = 5;
//
//        if (taskTwoValueA>10 && taskTwoValueA%3 ==0 && taskTwoValueA<=10000){
//            System.out.println("Is it possible to divide "+taskTwoValueA + " by " + taskTwoValueB + " :" + (taskTwoValueA%taskTwoValueB ==0));
//        }


//        int lastTaskNumberA = 68;
//        int lastTaskNumberB = 72;
//        int lastTasknumberC = 4;
//        int lastTasknumberD = 1;
//
//        if ((lastTaskNumberA+lastTaskNumberB>0) || (lastTasknumberC+lastTasknumberD>0)){
//            int sumOfNumbers = lastTaskNumberA+lastTaskNumberB+lastTasknumberC+lastTasknumberD;
//            System.out.println(sumOfNumbers);
//            if (sumOfNumbers>100 && sumOfNumbers%2==0){
//                System.out.println(sumOfNumbers/2);
//            }else{
//                if ((sumOfNumbers-1)%2==0){
//                    System.out.println(sumOfNumbers/2);
//                }else{
//                    System.out.println("The number is still not divisible by 2");
//                }
//            }
//        }

        //int radiusOfCircle = 4;
        //double areaOfCircle = Math.PI * (radiusOfCircle*radiusOfCircle);
        //System.out.println(areaOfCircle);


//        int valueX =5;
//        System.out.println((valueX+valueX+6)/2 - valueX);
//
//        int valueAmount = (valueX+valueX+6)/2 - valueX;
//        System.out.println(valueAmount%2==0);


        int novacUKasi = 100;
        int racun = 40;


        if (novacUKasi>100 && racun>0){
            System.out.println("you have too much money");
        }else if (novacUKasi<=100 && racun<=0){
            System.out.println("You didn't buy anything, did you?");
        }else if (novacUKasi<=100 && racun<0){
            System.out.println("Did you maybe break something? " + "Did you maybe break something?");
        }else{

            int kusur = novacUKasi - racun;
            int dvadesetKM = kusur/20;
            System.out.println("dvadeset KM: " + dvadesetKM);

            int desetKM = kusur/10;
            System.out.println("Deset KM: " + desetKM);

            int dvaKM = kusur/2;
            System.out.println("Dvije KM: " + dvaKM);

            int jedanKM = kusur/1;
            System.out.println("Jedna KM: " + jedanKM);
        }




    }

}