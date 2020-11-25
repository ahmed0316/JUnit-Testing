//SAMPLE ONLY. Sample of JUnit Testing.

//v4.2 (final)
package Trig;

import Trig.Trig;
import java.math.BigDecimal;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Ahmed Mohamed (aa14zu)
 * COSC 4F00 A2
 * Nov, 2019
 */
 
public class TrigTest {
    
    public TrigTest(){}
   
    private boolean degree; //true means degree mode, false means radian mode
    
    @Before
    public void intialize(){
        degree = true;      //intialize as true for each test
    } //iniailize
    
    @Test
    public void posIntPow(){
        System.out.println("Test for posIntPow Method");
        /*Check powers of 0*/
        assertTrue(Trig.posIntPow(5,0).doubleValue() == 1);               //5^0 should = 1
        assertTrue(Trig.posIntPow(5304133.342,0).doubleValue() == 1);
        assertTrue(Trig.posIntPow(-431.341,0).doubleValue() == 1);        //-431.341^0 should = 1
        /*Check powers of 1*/
        assertTrue(Trig.posIntPow(5,1).doubleValue() == 5);               //5^1 should = 5
        assertTrue(Trig.posIntPow(25.343,1).doubleValue() == 25.343);
        assertTrue(Trig.posIntPow(-5,1).doubleValue() == -5);
        assertTrue(Trig.posIntPow(0,1).doubleValue() == 0);
        /*Check other powers*/
        assertTrue(Trig.posIntPow(5,2).doubleValue() == 25);                //5^2 should = 25
        assertTrue(Trig.posIntPow(-5,2).doubleValue() == 25);
        assertTrue(Trig.posIntPow(0.5,4).doubleValue() == 0.0625);
        assertTrue(Trig.posIntPow(10,5).doubleValue() == 100000);
        assertTrue(Trig.posIntPow(3,2).doubleValue() == 9);
    }
    
    //....
}
