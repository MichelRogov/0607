package project.POJO.ListDefinition;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MyJavaList {

    @Autowired
    private List<ListItems> listItems;

    public void printList() {
        System.out.println("MyJavaList: " + listItems);
    }
}
