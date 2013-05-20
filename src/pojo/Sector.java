package pojo;

import java.util.List;

import dal.annotations.DBCollection;
import dal.annotations.Storeable;
import dal.annotations.Column;

@Storeable(tableName = "Sectors")
public class Sector {
	
	@Column(columnName = "id", autoGenerated = true, pk = true)
	private long id;
	
	@Column(columnName = "name")
	private String name;
	
	@Column(columnName = "description")
	private String description;
	
	@DBCollection(klass = User.class, thisPk = {"id"}, fk = {"sectorID"})
	private List<User> users;
	
	public String toString() {
		return "id = " + id + "; name = " + name + "; description = " + description;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<User> getUsers() {
		return users;
	}
}
