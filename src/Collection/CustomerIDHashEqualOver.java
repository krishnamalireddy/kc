package Collection;
/*
 * The two instances of CustomerID are logically equal 
 * according to the class's equals method. Because the hashCode() 
 * method is not overridden, these two instances' identities are not in 
 * common to the default hashCode implementation. Therefore, 
 * the Object.hashCode returns two seemingly random numbers instead of two 
 * equal numbers. Such behavior violates "Equal objects must have equal hash 
 * codes" 
 * 
 * rule defined in the hashCode contract.
 * 
 */

import java.util.HashMap;
import java.util.Map;

public class CustomerIDHashEqualOver {
	  private long crmID;
	  private int nameSpace;

	  public CustomerIDHashEqualOver(long crmID, int nameSpace) {
	    super();
	    this.crmID = crmID;
	    this.nameSpace = nameSpace;
	  }

	  public boolean equals(Object obj) {
	    //null instance of Object will always return false
	    if (!(obj instanceof CustomerIDHashEqualOver))
	      return false;
	    if (obj == this)
	      return true;
	    return  this.crmID == ((CustomerIDHashEqualOver) obj).crmID &&
	            this.nameSpace == ((CustomerIDHashEqualOver) obj).nameSpace;
	  }

	  public int hashCode() {
	    int result = 0;
	    result = (int)(crmID/12) + nameSpace;
	    return result;
	  }

	  public static void main(String[] args) {
	    Map<CustomerIDHashEqualOver, String> m = new HashMap<CustomerIDHashEqualOver, String>();
	    m.put(new CustomerIDHashEqualOver(2345891234L,0),"Jeff Smith");
	    System.out.println(m.get(new CustomerIDHashEqualOver(2345891234L,0)));
	  }

	}
