package e2e.util;

import com.github.javafaker.Faker;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class DataProviders {

    Faker faker = new Faker();

    @DataProvider
    public Iterator<Object[]>  loginValidData(){

        List<Object[]> list = new ArrayList<>();

        list.add(new Object[]{"standard_user", "secret_sauce"});
        list.add(new Object[]{"problem_user", "secret_sauce"});
        list.add(new Object[]{"performance_glitch_user", "secret_sauce"});
        list.add(new Object[]{"error_user", "secret_sauce"});
        list.add(new Object[]{"visual_user", "secret_sauce"});

        return list.iterator();
    }

    @DataProvider
    public Iterator<Object[]>  loginNotValidData(){

        List<Object[]> list = new ArrayList<>();

        list.add(new Object[]{"standard_user", "secretsauce","invalid_password"});
        list.add(new Object[]{"problemuser", "secret_sauce","invalid_email"});
        list.add(new Object[]{"12345","12345","with_invalid_data"});


        return list.iterator();
    }

    @DataProvider
    public Iterator<Object[]>  loginData(){

        List<Object[]> list = new ArrayList<>();

        list.add(new Object[]{"standard_user", "secret_sauce"});
        return list.iterator();
    }
}


