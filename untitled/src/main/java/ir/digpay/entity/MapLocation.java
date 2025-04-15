package ir.digpay.entity;

public class MapLocation {
    private int[][] location = new int[10][10];

    public MapLocation() {
    }

    public MapLocation(int[][] location) {
        this.location = location;
    }

    public int[][] getLocation() {
        return location;
    }

    public void setLocation(int[][] location) {
        this.location = location;
    }
}
