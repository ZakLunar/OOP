package init.university;

public class Aspirant extends Student{

    public Aspirant(String firstName, String lastName, String group, double averageMark) {
        super(firstName, lastName, group, averageMark);}


    @Override
    public void getScholarship() {
        System.out.print(this.getFirstName() + " 'as': Scholarship - ");
        if (this.getAverageMark() == 5) {
            System.out.println("200");
        } else {
            System.out.println("180");
        }
    }
}
