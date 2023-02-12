package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {
    public static void main(String[] args) {

      List<String> arrayList =  Collections.synchronizedList(new ArrayList<String>());
      arrayList.add("Java");
      arrayList.add("Python");
      arrayList.add("Kotlin");

      synchronized (arrayList) {
          Iterator<String> it = arrayList.iterator();
          while (it.hasNext()){
              System.out.println(it.next());
          }
      }

//        CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<String>("Jason", "Tom", "Usman");

    }
}
