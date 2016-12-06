package robots;


/**
 * rule robots.txt
 * */
public interface Rule {
	
	/**
	 * @return True if ALLOWED
	 * @return false if DISALLOWED
	 * null if there are no rules
	 * */

	Boolean isAllowed(String path);
}
