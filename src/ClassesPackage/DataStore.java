package ClassesPackage;
import java.util.ArrayList;

/**
 *
 * @author MOATH
 */
public class DataStore {
    public static ArrayList<UserClass> usersList = new ArrayList<>();
    public static ArrayList<TaskClass> tasksList = new ArrayList<>();
    public static ArrayList<TeamClass> teamsList = new ArrayList<>();
    public static UserClass currentUser = null;
    
    public static void initData() {
        if(usersList.isEmpty())
            usersList.add(new UserClass(1,"Moath","gheras@3elm.com", "123", "123","Web",UserRole.ADMIN, true,"team1"));
    
   if(teamsList.isEmpty()) {
        teamsList.add(new TeamClass(1, "Developers", "Team1"));
        teamsList.add(new TeamClass(2, "Testers", "Team2"));
        teamsList.add(new TeamClass(3, "Designers", "Team3"));
        }
    }
    }

