import com.bettercallsaul.lospolloshermanos.Menu;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.bettercallsaul.lospolloshermanos.MenuItem;

public class MenuManagementSteps {
    MenuItem newMenuItem;
    Menu branchMenu = new Menu();

    @Given("I have a menu item named {string}, which is a {string} with price {int}")
    public void i_have_a_menu_item_named_and_price(String itemName, String description, Integer int1) {
        newMenuItem = new MenuItem(itemName, description, int1);
        System.out.println("Step 1");
    }

    @When("I add the menu item")
    public void i_add_the_menu_item() {

        branchMenu.addMenuItem(newMenuItem);
        System.out.println("Step 2");
    }

    @Then("Menu item named {string} is added")
    public void menu_item_named_is_added(String string) {
        boolean exists = branchMenu.doesMenuItemExist(newMenuItem);
        System.out.println("Step 3");
    }

}
