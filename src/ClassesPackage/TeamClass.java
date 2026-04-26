package ClassesPackage;

/**
 *
 * @author MOATH
 */
public class TeamClass extends ParentClass {
    private String slug;
    /**
     *
     * 
     * 
     * @param slug
     */
    public TeamClass(int id, String Name, String slug){
        super(id,Name);
        this.slug=slug;
    }
      public String getDescription() { return slug; }
    

}
            

