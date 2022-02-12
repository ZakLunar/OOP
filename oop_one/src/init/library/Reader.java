package init.library;

public class Reader {
    private String fullName;
    private int accountNumber;
    private String facultet;
    private String dayOfBirthday;
    private String phoneNumber;

    public Reader(String fullName, int accountNumber, String facultet, String dayOfBirthday, String phoneNumber) {
        this.fullName = fullName;
        this.accountNumber = accountNumber;
        this.facultet = facultet;
        this.dayOfBirthday = dayOfBirthday;
        this.phoneNumber = phoneNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getFacultet() {
        return facultet;
    }

    public void setFacultet(String facultet) {
        this.facultet = facultet;
    }

    public String getDayOfBirthday() {
        return dayOfBirthday;
    }

    public void setDayOfBirthday(String dayOfBirthday) {
        this.dayOfBirthday = dayOfBirthday;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    //=====================================TAKE================================================

    public void takeBook(int amount) {
        System.out.println(this.fullName + " взяв " + amount + " книжок");
        System.out.println("========================");
    }

    public void takeBook(String... books) {
        System.out.println(this.fullName + " взяв книжки: ");
        for (String book : books) {
            System.out.println(book);
        }
        System.out.println("==========================");
    }

    public void takeBook(Book... books) {
        System.out.println(this.fullName + " взяв книжки: ");
        for (Book book : books) {
            System.out.println(book.getBookName() + " - " + book.getAuthor());
        }
        System.out.println("========================");
    }
    //====================================RETURN================================================

    public void returnBook(int amount) {
        System.out.println(this.fullName + " повернув " + amount);
        System.out.println("===========================");
    }

    public void returnBook(String... books) {
        System.out.println(this.fullName + " взяв книжки: ");
        for (String book : books) {
            System.out.println(book);
        }
        System.out.println("=========================");
    }

    public void returnBook(Book... books) {
        System.out.println(this.fullName + " взяв книжки: ");
        for (Book book : books) {
            System.out.println(book.getBookName() + " - " + book.getAuthor());
        }
    }
}
