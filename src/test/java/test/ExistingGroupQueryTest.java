package test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Test;

import uk.ac.cam.cl.ldap.LDAPGroup;
import uk.ac.cam.cl.ldap.LDAPQueryManager;
import uk.ac.cam.cl.ldap.LDAPObjectNotFoundException;

public class ExistingGroupQueryTest {
	
	// group that exists
	String id = "002278";
	
	@Test
	public void getTitle () {
		
		// get name
		String name = null;
		try {
			LDAPQueryManager qm = LDAPQueryManager.getInstance();
			
			LDAPGroup g = qm.getGroup(id);
			
			name = g.getName();
		} catch (LDAPObjectNotFoundException e) {
			fail(e.getMessage());
		}
		assertNotNull(name);
		System.out.println("Group name: " +name);
	
	} 
	
	@Test
	public void getDescription () {
		
		// get surname
		String description = null;
		try {
			LDAPQueryManager qm = LDAPQueryManager.getInstance();
			
			LDAPGroup g = qm.getGroup(id);
			
			description = g.getDescription();
		} catch (LDAPObjectNotFoundException e) {
			fail(e.getMessage());
		}
		assertNotNull(description);
		System.out.println("Description: " +description);
		
	}
	
	@Test
	public void getUsers () {
		
		// get users
		List<String> users = null;
		try {
			LDAPQueryManager qm = LDAPQueryManager.getInstance();
			
			LDAPGroup g = qm.getGroup(id);
			
			users = g.getUsers();
		} catch (LDAPObjectNotFoundException e) {
			fail(e.getMessage());
		}
		assertNotNull(users);
		System.out.print("Users: ");
		for(String u : users){
			System.out.print(u+",");
		}
		System.out.println();
		
	}

}
