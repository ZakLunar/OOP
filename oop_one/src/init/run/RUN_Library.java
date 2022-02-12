package init.run;

import init.library.Book;
import init.library.Reader;

public class RUN_Library {
    public static void main(String[] args) {

        Reader reader1 = new Reader("Кузнєцов П.А.", 1, "GS", "21.02.1987", "067 879 87 15");
        Reader reader2 = new Reader("Котік С.П.", 2, "BX", "24.03.1977", "066 431 65 11");
        Reader reader3 = new Reader("Малютка А.В.", 3, "AK", "10.11.1981", "050 567 54 87");

        Book book1 = new Book("Фієста", "Гемінгвей Е.");
        Book book2 = new Book("Відьмак", "Сапковський A.");
        Book book3 = new Book("Гаррі Поттер", "Роулінг Д.");
// ===============================================================================
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<TAKE>>>>>>>>>>>>>>>>>>>>>>>");
        reader1.takeBook(5);
        reader2.takeBook("Абетка", "Зроби сам");
        reader3.takeBook(book1, book2);
// ===============================================================================
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<RETURN>>>>>>>>>>>>>>>>>>>>>>>");
        reader1.returnBook(4);
        reader2.returnBook("Не здавайся", "Прокрастинація");
        reader3.returnBook(book1, book3);
    }
}
