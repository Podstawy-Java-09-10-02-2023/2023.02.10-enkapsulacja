package com.comarch.szkolenia.enkapsulacja;

public class Square {
    private int side;
    private int field;
    private int circuit;

    public Square(int side, int field, int circuit) {
        this.side = side;
        this.field = field;
        this.circuit = circuit;
    }

    public int getSide() {
        return this.side;
    }

    public int getField() {
        return this.field;
    }

    public int getCircuit() {
        return this.circuit;
    }

    public void setSide(int side) {
        this.side = side;
        this.field = side * side;
        this.circuit = 4 * side;
    }
}
