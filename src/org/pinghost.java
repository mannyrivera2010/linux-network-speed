package org;
import java.net.InetAddress;


// TODO: Auto-generated Javadoc
/**
 * The Class pinghost.
 */
public class pinghost {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args){
	   
		System.out.println("Is host reachable? " + hostReachable("192.168.2.1"));
	
	}
	
	
	/**
	 * Host reachable.
	 *
	 * @param strHost the str host
	 * @return true, if successful
	 */
	public static boolean hostReachable(String strHost){
		boolean isReachable=false;
	     try
	       {
	            InetAddress address = InetAddress.getByName(strHost);
	 
	            // Try to reach the specified address within the timeout
	            // periode. If during this periode the address cannot be
	            // reach then the method returns false.
	            isReachable = address.isReachable(3000);
	 
	            
	        } catch (Exception e){
	            e.printStackTrace();
	        }
		
		
		return isReachable;
	}

}
