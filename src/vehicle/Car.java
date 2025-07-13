package vehicle;
public class Car implements Vehicle{

    private final int daily_rate = 50;
    private String model;
    private int days;

    public Car(String model, int days) {
        this.model = model;
        setDays(days);
    }

    public int getDaily_rate() {
        return daily_rate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        if (days < 0){
            System.out.println("You cannot enter negative");
        }else {
            this.days = days;
        }
    }

    @Override
    public double calculateRentalCost() {
        return days*daily_rate;
    }

    @Override
    public void displayDetails() {
        System.out.println( "Car{" +
                "daily rate: " + daily_rate +
                ", car model: '" + model + '\'' +
                ", days: " + days +
                ", rental_cost: "+ calculateRentalCost()+
                '}');
    }


}
