package uas;

public abstract class rumus {
    private String operasi;
    private double input;
    private double jumlah;
    public abstract double hitung();
    public void button() {
        double jumlah = hitung();
    }
}
