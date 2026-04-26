package ClassesPackage;

/**
 *
 * @author MOATH
 */
public class ParentClass {
    protected int id;
    protected String name;

    // Constructor
    public ParentClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }

    public String getName() { return name; }
}
