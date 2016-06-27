import com.google.inject.AbstractModule;
import register.LenientRegistrar;
import store.DummyStudentStore;
import student.Registrar;
import student.StudentStore;

/**
 * Created by nlopez on 27/6/2016.
 */


public class SimpleModule extends AbstractModule {

    @Override
    protected void configure() {

        bind(StudentStore.class).to(DummyStudentStore.class);

        bind(Registrar.class).to(LenientRegistrar.class);

    }
}
