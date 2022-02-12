package init.university;

public class Student {
    private final String firstName;
    private final String lastName;
    private final String group;
    private final double averageMark;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGroup() {
        return group;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }


    public void getScholarship(){
        System.out.print(this.getFirstName() + " 'st': Scholarship - ");
        if(this.getAverageMark() == 5){
            System.out.println("100");
        } else {
            System.out.println("80");
        }
    }
}
