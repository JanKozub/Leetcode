package programming_skills;

import java.util.*;

class UndergroundSystem {

    Map<Integer, Customer> db = new HashMap<>();
    Map<Stations, MeasuredTime> times = new HashMap<>();

    public UndergroundSystem() {

    }

    public void checkIn(int id, String stationName, int t) {
        db.computeIfAbsent(id, k -> new Customer(stationName, t));
    }

    public void checkOut(int id, String stationName, int t) {
        Customer customer = db.get(id);
        Stations stations = new Stations(customer.getStartStation(), stationName);

        MeasuredTime time = times.get(stations);

        if (time != null){
            time.updateTime(t-customer.getTime());
        } else {
            times.put(stations, new MeasuredTime(t - customer.getTime()));
        }

        db.remove(id);
    }

    public double getAverageTime(String startStation, String endStation) {
        return times.get(new Stations(startStation, endStation)).getAverageTime();
    }
}

class Customer {
    private final String startStation;
    private final int time;

    public Customer(String startStation, int time) {
        this.startStation = startStation;
        this.time = time;
    }

    public String getStartStation() {
        return startStation;
    }

    public int getTime() {
        return time;
    }
}

class Stations {
    private final String s1;
    private final String s2;

    public Stations(String s1, String s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stations stations = (Stations) o;
        return Objects.equals(s1, stations.s1) && Objects.equals(s2, stations.s2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(s1, s2);
    }
}

class MeasuredTime {
    private double averageTime;
    private double sum;
    private int counter = 1;

    public MeasuredTime(double averageTime) {
        this.averageTime = averageTime;
        this.sum = averageTime;
    }

    public double getAverageTime() {
        return averageTime;
    }

    public void updateTime(double newTime) {
        this.sum = this.sum + newTime;
        this.counter = this.counter + 1;
        this.averageTime = this.sum / this.counter;
    }
}