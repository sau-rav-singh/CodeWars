package Codewars;

import java.util.List;

public class PyramidTower {
    //[
    //  "  *  ",
    //  " *** ",
    //  "*****"
    //]

    public static void main(String[] args) {
        int floors = 3;
        List<String> tower = List.of(towerBuilder(floors));
        for (String floor : tower) {
            System.out.println(floor);
        }
    }

    public static String[] towerBuilder(int nFloors)
    {
        String[] tower = new String[nFloors];
        for (int i = 0; i < nFloors; i++)
            tower[i] = " ".repeat(nFloors - i - 1) + "*".repeat(i * 2 + 1) + " ".repeat(nFloors - i - 1);
        return tower;
    }
}
