package TestNGExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SoftAssert {

    public static void main(String[] args) {
        SoftAssert s=new SoftAssert();
        

        System.out.println("First Assert is success");
        Assert.assertEquals(4,5);
        System.out.println("Second Assert is success");
        Assert.assertEquals(5,5);


    }

    @Test
    public void  DoSoftAssert(){
        Assert.assertEquals(5,5);
    }
}
