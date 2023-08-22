import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    //Дан массив пар названий книг и авторов, необходимо привести каждую пару в строку вида: «Название книги» Имя Отчество Фамилия автора.

    public static void main(String[] args) {

        int i = 0;

        List<String> booksAndAuthors = new ArrayList<>(Arrays.asList(
                "Гордость и предубеждение", "Джейн Остен",
                "Великий Гэтсби", "Фицджеральд, Фрэнсис Скотт",
                "Маленькие женщины", "Луиза Мэй Олкотт",
                "451° по Фаренгейту", "Рэй Брэдбери",
                "Гордость и предубеждение", "Джейн Остен"));


        for (String string : booksAndAuthors) {

            if (i++ % 2 == 0) {
                System.out.print("Название книги: " + string + " ");
            } else {
                System.out.println("Имя автора: " + string);
            }


        }











    }
}