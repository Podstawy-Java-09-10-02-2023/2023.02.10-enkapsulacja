package com.comarch.szkolenia.enkapsulacja;

public class App {
    public static void main(String[] args) {
        Square square = new Square(5, 25, 20);

        System.out.println(square.getSide());
        System.out.println(square.getField());
        System.out.println(square.getCircuit());

        //square.side = 10;
        square.setSide(7);

        System.out.println(square.getSide());
        System.out.println(square.getField());
        System.out.println(square.getCircuit());

        Client client = new Client(
                "Janusz",
                "Kowalski",
                30,
                123123123123L);

        client.setName("Wiesiek");

        client.surname = "asdf";
    }
}
