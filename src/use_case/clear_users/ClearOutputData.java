package use_case.clear_users;


import java.util.ArrayList;


public class ClearOutputData {
    final private ArrayList<String> users;
    private boolean useCaseFailed;


    public ClearOutputData(ArrayList<String> users, boolean useCaseFailed){
        this.users = users;
    }


    public ArrayList<String> getAllUsers(){
        return users;
    }
}
