package carTask;

import day34_abstraction.carTask.Audi;
import day34_abstraction.carTask.Car;
import day34_abstraction.carTask.Honda;
import day34_abstraction.carTask.Tesla;

import java.util.ArrayList;
import java.util.Collections;

public class CarTask {

    public static void main(String[] args) {

        Car[] cars = {
                new Honda("Pilot", "white", 2010, 25000),
                new Audi("Q6", "Red", 2014, 32000),
                new Audi("Q4", "Blue", 2015, 33000),
                new Audi("A7", "Black", 2019, 35000),
                new Audi("Q8", "White", 2018, 40000),
                new Audi("Q5", "Purple", 2009, 30000),
                new Audi("A4", "Black", 2011, 30000),
                new Honda("Civic", "Red", 2018, 30000),
                new Honda("CR-V", "Red", 2012, 23000),
                new Honda("HR-V", "Blue", 2019, 35000),
                new Tesla("Model 3", "White", 2015, 45000),
                new Tesla("Model Y", "Black", 2017, 65000),
                new Tesla("Model X", "White", 2016, 48000),
                new Tesla("Model X", "Blue", 2014, 48000),
        };
            //Display all cars that are eligible for recall
        ArrayList<Car> carList = new ArrayList<>();
        for (Car each : cars) {
            if (!(each instanceof Honda || each instanceof Audi || each instanceof Tesla)) {
                System.err.println("the car you entered is not in the list of recall");
                System.exit(1);
            } else if (each instanceof Honda && each.getYear() >= 2010 && each.getYear() <= 2011) {
                carList.add(each);
            } else if (each instanceof Audi && each.getYear() >= 2014 && each.getYear() <= 2019) {
                carList.add(each);
            } else {
                if (each.getYear() >= 2015 && each.getYear() <= 2016) {
                    carList.add(each);
                }
            }
        }
        System.out.println(carList);
        System.out.println("________________________________________________");

        // Display the car that has highestPrice
        ArrayList<Double> priceList = new ArrayList<>();
        for (Car each : cars) {
            priceList.add(each.getPrice());
        }
        ArrayList<Car> highestPriceCar = new ArrayList<>();
        for (Car each : cars) {
            if(each.getPrice()==Collections.max(priceList)){
                highestPriceCar.add(each);
            }
        }
        System.out.println("highest price car: "+highestPriceCar);

        //Display the lowest price car
        ArrayList<Car> lowestPriceCar = new ArrayList<>();
        for (Car each : cars) {
            if(each.getPrice()==Collections.min(priceList)){
                lowestPriceCar.add(each);
            }
        }
        System.out.println("Lowest price car: "+ lowestPriceCar);

        System.out.println("____________________________________________________");

        //Display the list of Tesla cars
        ArrayList<Car> teslaCars = new ArrayList<>();
        for (Car each : cars) {
            if(each instanceof Tesla){
                teslaCars.add(each);
            }
        }
        System.out.println(teslaCars);
    }
}



