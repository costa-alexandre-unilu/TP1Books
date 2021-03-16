package books;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * TODO : Add your import here
 */

public class BookShopTest {

    /**
     * TODO : Put your test here
     */
	BookShop myBookShoop = new BookShop("My Book Shop");
	
	/**
    @Test
    public void myFirstTest(){
        assertTrue(false);
    }
    */
    
    @Test
    public void firstTest() {
    	assertEquals(8*1,myBookShoop.cost(new int[]{1,0,0,0,0}));
    }
    
    @Test
    public void secondTest() {
    	assertEquals(8*0,myBookShoop.cost(new int[]{0,0,0,0,0}));
    }
    
    @Test
    public void thirdTest() {
    	assertEquals(8*4*0.72+8*6,myBookShoop.cost(new int[]{4,3,2,0,1}));
    }
    
    @Test
    public void fourthTest() {
    	assertEquals(8*2*0.93+8*19,myBookShoop.cost(new int[]{0,10,0,11,0}));
    }
    
    @Test
    public void fifthTest() {
    	assertEquals(8*3*0.86+8*107,myBookShoop.cost(new int[]{94,6,0,0,10}));
    }
    
    @Test
    public void sixthTest() {
    	assertEquals(8*3*0.86+8*27,myBookShoop.cost(new int[]{0,20,3,7,0}));
    }
    
    @Test
    public void seventhTest() {
    	assertEquals(8*2,myBookShoop.cost(new int[]{0,0,0,0,2}));
    }
    
    @Test
    public void eighthTest() {
    	assertEquals(8*2*0.93+8*21,myBookShoop.cost(new int[]{0,22,0,0,1}));
    }
    
    @Test
    public void	ninethTest() {
    	assertEquals(8*5*0.65+8*0,myBookShoop.cost(new int[]{1,1,1,1,1}));
    }
    
    @Test
    public void	tenthTest() {
    	assertEquals(8*5*0.65+8*1,myBookShoop.cost(new int[]{1,2,1,1,1}));
    }
    
    @Test
    public void	eleventhTest() {
    	assertEquals(8*4*0.72+8*0,myBookShoop.cost(new int[]{1,0,1,1,1}));
    }
    
    @Test
    public void	twelfthTest() {
    	assertEquals(8*4*0.72+8*9,myBookShoop.cost(new int[]{1,1,10,1,0}));
    }
    
    @Test
    public void	thirteenthTest() {
    	assertEquals(8*3*0.86+8*1008,myBookShoop.cost(new int[]{1000,1,0,10,0}));
    }
    
    @Test
    public void	fourteenthTest() {
    	assertEquals(8*3*0.86+8*0,myBookShoop.cost(new int[]{1,0,0,1,1}));
    }
    
    @Test
    public void	fifteenthTest() {
    	assertEquals(8*4*0.72+8*9,myBookShoop.cost(new int[]{1,1,10,1,0}));
    }
    
}