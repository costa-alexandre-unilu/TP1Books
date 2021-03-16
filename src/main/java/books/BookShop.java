package books;

public class BookShop {

    private final String name;

    /**
     * Constructor of the class Book shop
     * @param name name of the book shop
     */
    public BookShop(String name){
        this.name = name;
    }

    /**
     * method to compute the cost of a basket
     * @param books array corresponding to the number of each harry potter book the client desire to buy (books.length should return 5)
     * @return the cost in euro with the discount
     */
    public double cost(int[] books){
    	
    	int count = 0;
    	int total = 0;
    	
    	for(int i = 0; i<5; i++)
    	{
    		if(books[i]==0)
    		{
    			count++;
    		}
    		total = total + books[i];
    	}

    	int differentbooks = 5-count;
    	double discountvalue = 0;
    	
    	switch(differentbooks) {
    	default:
    		return 0;
    	case 1:
    		return total*8.0;
    	case 2:
    		discountvalue = 2*8*0.93;
    		total = total - 2;
    		return (total*8)+discountvalue;
    	case 3:
    		discountvalue = 3*8*0.86;
    		total = total - 3;
    		return (total*8)+discountvalue;
    	case 4:
    		discountvalue = 4*8*0.72;
    		total = total - 4;
    		return (total*8)+discountvalue;
    	case 5:
    		discountvalue = 5*8*0.65;
    		total = total - 5;
    		return (total*8)+discountvalue;

    		
    	}
    			
    			
    	}
    }

