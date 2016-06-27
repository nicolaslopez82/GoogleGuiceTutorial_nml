/**
 * Created by nlopez on 27/6/2016.
 */

import java.util.Scanner;

import com.google.inject.Guice;
import com.google.inject.Injector;
import store.DummyStudentStore;
import student.Registrar;
import student.Student;
import student.StudentStore;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println( "Welcome to the Registration Database App...");
        System.out.println( "Person ID? " );
        Scanner scanner = new Scanner(System.in);
        Integer personId = new Integer( scanner.nextLine() );
        scanner.close();

        System.out.printf( "You supplied Person ID %d searching...\n", personId );

        Injector injector = Guice.createInjector(new SimpleModule() );
        StudentStore studentStore = injector.getInstance( DummyStudentStore.class );
        Registrar registrar = injector.getInstance( Registrar.class );

        Student s = new Student( personId, 12 );
        studentStore.save( s );

        boolean status = registrar.checkStudentStatus( personId );

        if( status ) {
            System.out.println( "This student is currently enrolled and meets " +
                    "the registrar's criteria" );
        } else {
            System.out.println( "This student does not meet the registrar's criteria" );
        }

    }
}
