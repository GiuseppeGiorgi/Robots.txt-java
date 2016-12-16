package robots;


/**
* @author Giuseppe Giorgi <giuseppe.giorgi1987@gmail.com>
*/

 // rule robots.txt
public interface Rule {
	
	/**
	 * @return True if ALLOWED
	 * @return false if DISALLOWED
	 * null if there are no rules
	 * */

	Boolean isAllowed(String path);
}
