package InterviewProblems;

import org.testng.annotations.Test;

public class RetrieveEnumValues {

    public static void main(String[] args) {
        System.out.println("hello world");
        EnumExample enumExample = EnumExample.valueOf("addPlaceAPI");
        System.out.println(enumExample.getResources());
    }

}
