package init.run.company.professions;

public abstract class Person {
    private final String fio;
    private final int workExperience;

    public Person(String fio, int workExperience) {
        this.fio = fio;
        this.workExperience = workExperience;
    }

    public String getFio() {
        return fio;
    }

    public int getWorkExperience() {
        return workExperience;
    }
}
