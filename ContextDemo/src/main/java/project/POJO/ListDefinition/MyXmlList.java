package project.POJO.ListDefinition;

import org.springframework.beans.factory.annotation.Required;

import java.util.List;

public class MyXmlList {

    private List<ListItems> listItems;

    @Required
    public void setListItems(List<ListItems> listItems) {
        this.listItems = listItems;
    }

    public void printList() {
        System.out.println("MyXmlList: " + listItems);
    }
}
