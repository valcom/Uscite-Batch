/**
 * 
 */
package it.ccse.uscite.batch.usernameBatch;

/**
 * @author valer
 *
 */
public class EntityRecord {
	private long id;
		
	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "EntityRecord [id=" + id + ", username=" + username + "]";
	}


	
	
}
