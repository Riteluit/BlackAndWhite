package vista;

import java.util.ArrayList;
import mundo.BlackNWhiteS3;
import sss.Actions;
import sss.SearchStateSpaces;

public class InterfazApp {

    public static void main(String[] args) {

        BlackNWhiteS3 blacknwhiteS3;

        String fichas[] = {"B", "B", "B", "-", "W", "W", "W"};
        SearchStateSpaces sss;
        ArrayList<Actions> lst;

        System.out.println("blacknwhiteS3");
        blacknwhiteS3 = new BlackNWhiteS3(fichas);
        sss = new SearchStateSpaces("WWW-BBB", blacknwhiteS3, 4);
        lst = sss.solve();

        System.out.println("Número de pasos: " + lst.size());

        if (lst.size() > 0) {
            for (int i = 0; i < lst.size(); i++) {
                System.out.println(lst.get(i));
            }
        }else{
            System.out.println("No hay Solucion.");
        }
    }
}
