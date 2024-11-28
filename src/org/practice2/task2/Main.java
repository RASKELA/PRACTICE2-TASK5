package org.practice2.task2;

public class Main {
    public static void main(String[] args) {
        Size size = new Size();
        size.setHeight((short) 10);
        size.setWidth((short) 4);

        TransportBuilder builder = new EcoTransportBuilder();
        Transport ecoBus = builder
                .setBaseParams("EcoBus", (short) 2024, "42B")
                .setSizeParams(size)
                .setEcoParams(true, "Electric")
                .setTypeParams("Bus", new String[]{"Kyiv", "Lviv", "Odesa"})
                .build();

        System.out.println("org.practice2.task2.Transport Name: " + ecoBus.getName());
        System.out.println("Year: " + ecoBus.getYear());
    }
}