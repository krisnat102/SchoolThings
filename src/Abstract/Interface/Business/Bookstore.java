package Abstract.Interface.Business;

import java.util.ArrayList;
import java.util.List;

public class Bookstore {
    public static void main(String[] args) {
        Book book = new Book(10,10,10,"fantasy","THe good book", "George rr martin");
        Atlas atlas1 = new Atlas(102,10,10,"atlas","DE WORLDE 1", "Dio", "africa", 1989);
        Atlas atlas2 = new Atlas(103,10,10,"atlas","DE WORLDE 2", "Dio", "africa", 1990);
        Atlas atlas3 = new Atlas(104,10,10,"atlas","DE WORLDE 3", "Dio", "africa", 1991);
        Atlas atlas4 = new Atlas(105,10,10,"atlas","DE WORLDE 4", "Dio", "africa", 1992);
        Atlas atlas5 = new Atlas(106,10,10,"atlas","DE WORLDE 5", "Dio", "africa", 1993);
        Atlas atlas6 = new Atlas(107,10,10,"atlas","DE WORLDE 6", "Dio", "africa", 1994);

        List<Atlas> atlases = new ArrayList<>();

    }
}
