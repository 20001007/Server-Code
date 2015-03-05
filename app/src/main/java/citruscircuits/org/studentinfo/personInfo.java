package citruscircuits.org.studentinfo;
import io.realm.RealmObject;
/**
 * Created by citruscircuits on 3/1/15.
 */
public class personInfo extends RealmObject{

    private String name;
    private String email;
    private int age;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }


}
