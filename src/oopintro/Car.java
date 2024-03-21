package oopintro;

public class Car {public Car(String make, String model, int year){
}
    private String make;
    private String model;
    private int year;
    private static int maxSpeedLimit = 120;
    public static int getMaxSpeedLimit(){
        return maxSpeedLimit;
    }
    public void displayInfo(){
        System.out.println(make);
        System.out.println(model);
        System.out.println(year);
    }
    public void setMake(String m){
        make = m;
    }
    public String getMake(){
        return make;
    }
    public void setModel(String mdl){
        model = mdl;
    }
    public String getModel(){
        return model;
    }
    public void setYear(int yr){
        year = yr;
    }
    public int getYear(){
        return year;
    }
}
