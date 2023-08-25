package az.atlacademy.lesson17_p2;

import java.util.Comparator;

public class WorkerComperator implements Comparator<Worker> {
    @Override
    public int compare(Worker w1, Worker w2) {
        if (w1.getDuty() != w2.getDuty()) {
            w2.getDuty().compareTo(w1.getDuty());
        } else if (w1.getName() != w2.getName()) {
            w1.getName().compareTo(w2.getName());
        } else if (w1.getId() != w2.getId()) {
            return Integer.compare(w1.getId(), w2.getId());
        } else if (w1.getAge() != w2.getAge()) {
            return Integer.compare(w2.getAge(), w1.getAge());
        }
        return Double.compare(w2.getSalary(), w1.getSalary());
    }
}
