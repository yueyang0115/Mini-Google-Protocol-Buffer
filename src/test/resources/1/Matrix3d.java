import java.util.*;
import org.json.*;

public class Matrix3d{
private ArrayList<Collection<Collection<Integer>>> data;

public Matrix3d(){
this.data = new ArrayList<>();
}

public int numDatas(){
return data.length;
}
public void addDatas(Collection<Collection<Integer>> n){
data.add(n);
}
public Collection<Collection<Integer>> getDatas(int index){
return data.get(index);
}
public void setDatas(int index, Collection<Collection<Integer>> n){
data.set(index,n);
}

}
