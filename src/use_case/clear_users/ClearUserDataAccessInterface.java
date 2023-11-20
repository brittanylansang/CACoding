package use_case.clear_users;


import java.util.ArrayList;

public interface ClearUserDataAccessInterface {
    ArrayList<String> getAll();
    void delete(String username);
    boolean existsByName(String identifier);
    void clear();
}
