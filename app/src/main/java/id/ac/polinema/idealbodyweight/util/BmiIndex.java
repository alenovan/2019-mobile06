package id.ac.polinema.idealbodyweight.util;

public class BmiIndex {

    private float index,tinggi,berat;

    public BmiIndex(float  berat, float  tinggi) {
        this.berat = berat;
        this.tinggi = tinggi;
        this.index = calculate();
    }

    public float getIndex() {
        return index;
    }

    private float calculate() {
        float bmi   = berat / (tinggi * tinggi);
        return bmi;
    }
}
