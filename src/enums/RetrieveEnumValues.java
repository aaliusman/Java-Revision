package enums;

import org.testng.annotations.Test;

public class RetrieveEnumValues {
    @Test
    public void test(){
        System.out.println("hello world");
    }

    @Test
    public void getEnumValues(){
        System.out.println("hello world");
        EnumExample enumExample = EnumExample.valueOf("addPlaceAPI");
        System.out.println(enumExample.getResources());
    }

}
