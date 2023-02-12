package abstraction;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;

public class Child {


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,3,4,5,6,7,8,9));

        List<Integer> templist = new ArrayList<Integer>();
        for (Integer element: list) {
            if(element % 2 == 0) {
                templist.add(element);
            }
        }
        list.removeAll(templist);

        System.out.println(templist);
    }

}
