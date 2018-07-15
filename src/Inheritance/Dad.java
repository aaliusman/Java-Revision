package Inheritance;

public class Dad extends GrandDad {

    String bztype;
    public void cars(){
        System.out.println("Dad has 4 cars");
    }

    public String business(String bztype){
        this.bztype = bztype;
        return bztype;
    }
}
