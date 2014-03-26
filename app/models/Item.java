package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Item: k16wire
 * Date: 2014. 3. 26.
 * Time: 오전 2:14
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Item extends Model{
    public static Finder<Long,Item> finder = new Finder<Long,Item>(Long.class, Item.class);

    @Id
    public Long id;
    public String name;
    public String title;
    public int type;
    public int height;
    public int length;
    public int viewCount;
    public String description;
    public Long userId;

    public static List<Item> findAll(){
        return finder.all();
    }
}
