package interface_adapter.clear_users;

import java.util.ArrayList;

public class ClearState {
    private ArrayList<String> usernames = new ArrayList<>();

    public ArrayList<String> getDeleted() {
        return usernames;
    }

    public void setDeleted(Object deleted) {
        // Cast the object to an ArrayList of strings
        this.usernames = (ArrayList<String>) deleted;
    }

    public void setDeletedError(String error) {
    }
}