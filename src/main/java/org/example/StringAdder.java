package org.example;

public class StringAdder {

    public int add(String s) {
        s = s.trim();

        if (s.equals("")) {
            return 0;
        }

        try {
            if (!s.contains(",")) {
                return trimAndParse(s);
            } else {
                int komma = s.indexOf(",");

                String part1 = s.substring(0, komma);
                String part2 = s.substring(komma + 1);

                return add(part1) + add(part2);
            }
        } catch (UnsupportedOperationException e) {
            throw new UnsupportedOperationException("Not yet implemented");
        } catch (Exception e){
            throw new RuntimeException();
        }
    }

    private int trimAndParse(String input) {
        return Integer.parseInt(input.trim());
    }

}

