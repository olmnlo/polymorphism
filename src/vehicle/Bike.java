package vehicle;
public class Bike implements Vehicle{

    private final int hourly_rate = 10;
    private String brand;
    private int hours;

    public Bike(String brand, int hours) {
        this.brand = brand;
        setHours(hours);
    }

    public int getHourly_rate() {
        return hourly_rate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours < 0){
            System.out.println("You cannot enter negative");
        }else {
            this.hours = hours;
        }
    }

    @Override
    public double calculateRentalCost() {
        return hours*hourly_rate;
    }

    @Override
    public void displayDetails() {
        System.out.println( "Bike{" +
                "hourly_rate: " + hourly_rate +
                ", brand: '" + brand + '\'' +
                ", hours: " + hours +
                ", rental_cost: "+ calculateRentalCost()+
                '}');

    }
}
