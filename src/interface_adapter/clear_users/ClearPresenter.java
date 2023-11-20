package interface_adapter.clear_users;


import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;
import interface_adapter.ViewManagerModel;
import interface_adapter.signup.SignupViewModel;




public class ClearPresenter implements ClearOutputBoundary {
    private final ClearViewModel clearViewModel;
    private final ViewManagerModel viewManagerModel;


    public ClearPresenter(ViewManagerModel viewManagerModel, ClearViewModel clearViewModel, SignupViewModel signupViewModel){
        this.viewManagerModel = viewManagerModel;
        this.clearViewModel = clearViewModel;
    }


    @Override
    public void prepareSuccessView(ClearOutputData response) {
        // On success, we want to display a message box in signup view


        ClearState clearState = clearViewModel.getState();
        clearState.setDeleted(response.getAllUsers());
        this.clearViewModel.setState(clearState);
        this.clearViewModel.firePropertyChanged();


        viewManagerModel.setActiveView(clearViewModel.getViewName());
        viewManagerModel.firePropertyChanged();
    }


    @Override
    public void prepareFailView(String errorMessage) {
        ClearState clearState = clearViewModel.getState();
        clearState.setDeletedError(errorMessage);
        clearViewModel.firePropertyChanged();
    }
}