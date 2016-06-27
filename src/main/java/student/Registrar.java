package student;

/**
 * Created by nlopez on 27/6/2016.
 */
public interface Registrar {

    public boolean checkStudentStatus( Integer studentId );
    public Student registerStudent( String name, Integer credits );

}