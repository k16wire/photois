package controllers;

import models.Item;
import play.*;
import play.mvc.*;

import views.html.*;

import java.util.ArrayList;
import java.util.List;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public static Result itemList() {
        List<Item> items = Item.findAll();
        return ok(itemList.render(items));
    }
}
