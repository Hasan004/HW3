package org.example;

import java.util.ArrayList;
import java.util.List;

public class Start {

    public static void main(String[] args) {

// H3.1
//        int i = 3;
//        System.out.println(i);
//
//        // int x:
//        // x = i
//        // i + 1
//        int x = i++;
//        System.out.println(x);
//
//
//        int d = ++i;
//        System.out.println(d);
//
//// H3.2
//        int j = i == 3 ? i++ + ++i : ++i >>> 1;
//        System.out.println(j);
//
//        //5 >>> 1:
//        //Antwoord: 3
//
//// H3.3
//        byte h = 0b1010;
//        byte g = 0b100;
//        System.out.println("bytes are: " + h+g);
//        // antwoord: 104
//
//// H3.4
//        int a = 80;
//        int tijd = 24;
//        int huidigetijd = 23;
//        System.out.println("aantal dagen: " + a/tijd);
//        System.out.println("aantal uren: " + a%tijd);
//        System.out.println("dus het is dan: " + ((a%tijd)+huidigetijd-24) + " uur");
//        // dus na 3 dagen en 8 uur: dat komt uit op de 4e dag om 7 uur 's ochtends
//
//// H3.5
//        System.out.println("Maximum " + Byte.MAX_VALUE + " en minimum " + Byte.MIN_VALUE); // MAX: 127 & MIN: -128
//        System.out.println("Maximum " + Integer.MAX_VALUE + " en minimum " + Integer.MIN_VALUE); // MAX: 2147483647 & MIN: -2147483648
//        System.out.println("Maximum " + Long.MAX_VALUE + " en minimum " + Long.MIN_VALUE); // MAX: 9223372036854775807 & MIN: -9223372036854775808
//        System.out.println("Maximum " + Short.MAX_VALUE + " en minimum " + Short.MIN_VALUE); // MAX: 32767 & MIN: -32768
//        System.out.println("Maximum " + Double.MAX_VALUE + " en minimum " + Double.MIN_VALUE); // MAX: 1.7976931348623157E308 & MIN: 4.9E-324
//        System.out.println("Maximum " + Float.MAX_VALUE + " en minimum " + Float.MIN_VALUE); // MAX: 3.4028235E38 & MIN: 1.4E-45
//
//// H3.6
//        //Client client1 = new Client("Jan");
//        //Client client2 = new Client("Piet");
//        //client2 = client1;
//        //client2.name = "Joris";
//        //What is client1's name after executing this code: joris
//
//        Client client1 = new Client("Jan");
//        Client client2 = new Client("Piet");
//        client2 = client1;
//        client2.firstname = "joris";
//        System.out.println(client1.firstname);
//
//
//        List<Integer> elements = new ArrayList<>();
//        elements.add(10);
//        int firstelement = elements.get(0);
//        System.out.println(firstelement);

        StringAdder s = new StringAdder();
        s.add("3");

    }

}