package student;

/**
 * Created by nlopez on 27/6/2016.
 */
public interface StudentStore {
    public boolean exists(Integer id);
    public Student load(Integer id);
    public Student save(Student p);
}
