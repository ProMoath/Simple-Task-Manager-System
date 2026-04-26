package ClassesPackage;

/**
 *
 * @author MOATH
 */
public class TaskClass extends ParentClass {
    public enum Priority { CRITICAL, MAJOR, MINOR }

    private String description;
    private Priority priority;
    private String assigneeUser;
    
    public TaskClass(int id, String title, String description, Priority priority, String assigneeName) 
    {
        super(id,title);
        this.description = description;
        this.priority = priority;
        assigneeUser = assigneeName;
    }
        
    public String getDescription() { return description; }
    public Priority getPriority() { return priority; }
    public String getAssigneeName() { return assigneeUser; }
    
}
