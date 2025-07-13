package vehicle;
public class Truck implements Vehicle{

    private final int weekly_rate = 500;
    private String type;
    private int weeks;

    public Truck(String type, int weeks) {
        this.type = type;
        setWeeks(weeks);
    }

    public int getWeekly_rate() {
        return weekly_rate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeeks() {
        return weeks;
    }

    public void setWeeks(int weeks) {
        if (weeks < 0){
            System.out.println("You cannot enter negative");
        }else {
            this.weeks = weeks;
        }
    }

    @Override
    public double calculateRentalCost() {
        return weeks*weekly_rate;
    }

    @Override
    public void displayDetails() {
        System.out.println( "Truck{" +
                "weekly_rate=" + weekly_rate +
                ", type='" + type + '\'' +
                ", weeks=" + weeks +
                ", rental_cost= "+ calculateRentalCost()+
                '}');
    }
    }



