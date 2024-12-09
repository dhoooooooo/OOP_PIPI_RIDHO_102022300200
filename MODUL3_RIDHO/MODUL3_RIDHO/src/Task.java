import java.time.LocalDate;

public class Task {
    // TO DO: Lengkapi atribut-atribut private kelas Task
    private final String title;
    private final String priority;
    private final LocalDate dueDate; 
    private String status;

    // TO DO: Buat constructor untuk kelas Task
    public Task(String title, String priority, LocalDate duedate, String status) {
        this.title = title;
        this.priority = priority;
        this.dueDate = duedate;
        this.status = status;
    }
    // TO DO: Buat getter untuk title

    public String getTitle() {
        return title;
    }

    public String getPriority() {
        return priority;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public String getStatus() {
        return status;
    }

    
    // TO DO: Buat setter untuk status

    public void setStatus(String status) {
        this.status = status;
    }
    
}
