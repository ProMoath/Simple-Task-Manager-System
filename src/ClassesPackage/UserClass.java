package ClassesPackage;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;




/**
 *
 * @author MOATH
 */
public class UserClass extends ParentClass {
    protected String Email;
    private String Pass;
    private String ConPass;
    private UserRole role; 
    private String jobField;
    boolean Status;
    String teams;
    private int age;
    
    public UserClass(int id, String name, String email, String password,String Confirm ,
            String jobField, UserRole role, boolean status, String teams,int age)
    {
        super(id,name);
        Email=email;
        Pass=password;
        ConPass=Confirm;
        Status=status; 
        this.role = role;
        this.jobField=jobField;
        this.teams=teams;
        this.age=age;
    }
    public String getEmail() { return Email; }
    public String getJobField() { return jobField; }
    public UserRole getRole() { return role; }
    public String getTeams() { return teams; }
    public int getAge() { return age; }
    public String getPass() {return this.Pass;}
    public boolean getStatus() { return Status; }
    
    
    public boolean checkPassword(String inputPass) {
        return this.Pass.equals(inputPass);
    }
    public void setRole(UserRole role) {
        this.role = role;
    }
    
        @Override
    public String toString() {
        return this.name;
    }
    public static String hashPassword(String password) throws NoSuchAlgorithmException {
    MessageDigest md = MessageDigest.getInstance("SHA-256");
    byte[] hash = md.digest(password.getBytes());
    StringBuilder hexString = new StringBuilder();
    for (byte b : hash) {
        hexString.append(String.format("%02x", b));
    }
    return hexString.toString();
}

    
}
