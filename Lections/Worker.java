package Lections;

public class Worker {
    int id;
    int salary;
    String firstname;
    String lastname;

    @Override
    public String toString() {
        return String.format("id: %d fn: %s ls: %s s: %d", id, firstname, lastname, salary);
    }

    @Override
    public boolean equals(Object o) {
        Worker t = (Worker) o;
        return id == t.id && firstname == t.firstname;
    }

    @Override
    public int hashCode() {        
        return id;
    }
}
