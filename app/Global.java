import com.avaje.ebean.Ebean;
import models.Item;
import play.Application;
import play.GlobalSettings;
import play.Logger;
import play.libs.Yaml;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: k16wire
 * Date: 2014. 3. 26.
 * Time: 오후 4:01
 * To change this template use File | Settings | File Templates.
 */
public class Global extends GlobalSettings {
    @Override
    public void onStart(Application app) {
        if (Ebean.find(Item.class).findRowCount() == 0) {
            Map<String, List<Object>> all = (Map<String, List<Object>>) Yaml.load("test-data.yml");
            Iterator<String> it = all.keySet().iterator();
            while(it.hasNext()){
                String entityName = it.next();
                Logger.debug(entityName);
                Ebean.save(all.get(entityName));
            }
        }
    }
}
