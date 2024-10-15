package StepDefiniton;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import java.util.List;

public class _04_Datatable {
    @When("Write username {string}")
    public void writeUsername(String username) {
        System.out.println(username);
    }

    @When("Write username and password {string} and {string}")
    public void writeUsernameAndPasswordAnd(String username, String password) {
        System.out.println(username + " " + password);
    }

    @And("Write username as Datatable")
    public void writeUsernameAsDatatable(DataTable dtUser) {
        List<String> listUser = dtUser.asList(String.class);

        for (String user : listUser){
            System.out.println(user);
        }
    }

    @And("Write username and password as Datatable")
    public void writeUsernameAndPasswordAsDatatable(DataTable dtUser) {

        List<List<String>> listUser = dtUser.asLists(String.class);

        for (int i = 0; i < listUser.size(); i++) {
            System.out.println(listUser.get(i).get(0) + " " +listUser.get(i).get(1));
        }
    }
}
