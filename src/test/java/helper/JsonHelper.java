package helper;


import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import model.Email;
import model.User;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;

public class JsonHelper {

    static List<User> users;
    static List<Email> emails;

    public static User getUserById(int index){
        Gson gson = new Gson();
        FileReader reader = null;
        try {
            reader = new FileReader("User.json");
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }

        Type userListType = new TypeToken<List<User>>() {}.getType();
        users = gson.fromJson(reader, userListType);
        return users.get(index);

    }

    public static Email getEmailById(int index){
        Gson gson = new Gson();
        FileReader reader = null;
        try {
            reader = new FileReader("email.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Type emailListType = new TypeToken<List<Email>>() {}.getType();
        emails = gson.fromJson(reader, emailListType);
        return emails.get(index);

    }
}
