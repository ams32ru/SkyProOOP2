package transport;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Mechanic < T extends Transport>{

    private final String fullNameMech;
    private final String company;

    public Mechanic(String fullNameMech, String company) {
        this.fullNameMech = fullNameMech;
        this.company = company;
    }

    public static Set<Mechanic> mechanics = new HashSet<>();

    public static void addMechanics(Mechanic mex) {
        for (Mechanic mechanic : mechanics) {
            if (mechanics.contains(mex)) {
                throw new IllegalArgumentException("Механик уже добавлен");
            } else mechanics.add(mex);
        }
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
