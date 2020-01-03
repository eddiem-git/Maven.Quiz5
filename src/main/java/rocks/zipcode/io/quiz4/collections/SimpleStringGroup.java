package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 11/12/2018.
 */
public class SimpleStringGroup {
    private List<String> stringGroup;


    public SimpleStringGroup(){
        stringGroup = new ArrayList<>();
    }

    public Integer count() {
        return this.stringGroup.size();
    }

    public void insert(String string){
        this.stringGroup.add(string);
    }

    public Boolean has(String string){
        return this.stringGroup.contains(string);
    }

    public String fetch(int indexOfValue){
        return this.stringGroup.get(indexOfValue);
    }

    public void delete(String string){
        this.stringGroup.remove(string);
    }

    public void clear(){
        this.stringGroup.clear();
    }
}