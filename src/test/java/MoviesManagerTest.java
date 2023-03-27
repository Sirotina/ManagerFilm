import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static sun.awt.windows.WGlobalCursorManager.manager;

public class MoviesManagerTest {
    @Test
            public void findAll() {
        MoviesManager manager = new MoviesManager();

        manager.add("Film I");
        manager.add("Film II");
        manager.add("Film III");

        String[] expected = {"Film I","Film II","Film III" };
        String [] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void findAllIfAddOneFilm() {
        MoviesManager manager = new MoviesManager();

        manager.add("Film III");

        String[] expected = {"Film III"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public String[] findLast() {
       String[] tmp = new String[10];
        for (int i = 0; i < tmp.length; i ++) {
            String[] movies;
            movies = new String[0];
            tmp[i] = movies[movies.lenth - 1 - i];
        }
        return tmp;

        String[] expected = {"Film III"};
        MoviesManagerTest manager;
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }






}
