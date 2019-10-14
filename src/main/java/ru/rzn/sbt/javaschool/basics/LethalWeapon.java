package ru.rzn.sbt.javaschool.basics;

public class LethalWeapon {
    public String color;
    private int roundsLeft;
    private Double power;

    private static long nextSerial = 0;
    private final long serial;


    public LethalWeapon() {
        this.serial = nextSerial;
        nextSerial++;
    }

    public LethalWeapon(String color, Double power, int roundsLeft) {
        this();
        this.color = color;
        this.power = power;
        this.roundsLeft = roundsLeft;
    }

    public void setPower(Double power) {
        this.power = power;
    }

    public Double getPower() {
        return power;
    }

    public long getSerial() {
        return serial;
    }

    public void reload(int countShell) {
        roundsLeft += countShell;
    }

    public void pewPew() {
        roundsLeft = roundsLeft - 2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof LethalWeapon) {
            LethalWeapon lw = (LethalWeapon) o;
            return this.color.equals(lw.color) && this.power.equals(lw.power) && this.roundsLeft == lw.roundsLeft;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = color.hashCode();
        result = 31 * result + power.hashCode();
        result = 31 * result + Integer.hashCode(roundsLeft);
        return result;
    }
}
