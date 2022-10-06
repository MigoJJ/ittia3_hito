package rosArray;


import java.util.ArrayList;
import java.util.Iterator;
 
public class RosPickupList {
    ArrayList<String> list = new ArrayList<>();
    
    public void addListfromJtable(ArrayList<String> args) {
		list.addAll(args);
        System.out.println(list);
		RosSelectListChage.main(list);
    }
    
    public void addList() {
        list.add("1");
        list.add("21");

        Iterator<String> itr = list.iterator();
        
        while (itr.hasNext()) {
        	String i = itr.next();
            System.out.print(i + ">> , ");
            } 
        
    }
 
    //setter
    public void setList(ArrayList list) {
        this.list = list;
    }
 
    //getter
    public ArrayList getList() {
        return list;
    }
    
}