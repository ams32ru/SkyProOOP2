package transport;

import java.util.Objects;

public class Mechanic < T extends Transport>{

    private final String fullNameMech;
    private final String company;

    public Mechanic(String fullNameMech, String company) {
        this.fullNameMech = fullNameMech;
        this.company = company;
    }

    public String getFullNameMech() {
        return fullNameMech;
    }

    public String getCompany() {
        return company;
    }

    public boolean servis(T t) {
        return t.texService();
    }

    public void repair(T t) {
        t.repaer();
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "fullNameMech='" + fullNameMech + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic<?> mechanic = (Mechanic<?>) o;
        return Objects.equals(fullNameMech, mechanic.fullNameMech) && Objects.equals(company, mechanic.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullNameMech, company);
    }
}
