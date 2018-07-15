package Assert.unit;


import org.testng.Assert;


public class UnitTest {
    public static void main(String[] args) {

        testing test = new testing();
        try {


        Assert.assertEquals(test.add(4,11), 15);}
        catch (Exception ex){
            System.out.println(ex);
        }
        System.out.println(test.add(4,11));
        Assert.assertEquals(test.div(16, 4), 4);
        System.out.println(test.div(16, 4));

        System.out.println(test.sub(90, 30));
        try {
            Assert.assertEquals(test.sub(90, 30), 30);
        }
        catch (Exception ex1){
            System.out.println(ex1);
        }
    }
}
