package store.entity;

import java.util.Objects;

public class User {
	public static long nextId = 0;
    public long id = nextId++;
    private String username;
    private String email;
    private String fName;
    private String lName;
    private String password;
    private Role role;

    public User() {}

    public User(long id){
        this.id = id;
    }

    public User(String username, String email, String fName, String lName, String password) {
        this.username = username;
        this.email = email;
        this.fName = fName;
        this.lName = lName;
        this.password = password;
        this.role = Role.CUSTOMER;
    }

    public User(String username, String email, String fName, String lName, String password, Role role) {
        this.username = username;
        this.email = email;
        this.fName = fName;
        this.lName = lName;
        this.password = password;
        this.role = role;
    }

    
    
    public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int)(id^(id >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                Objects.equals(username, user.username) &&
                Objects.equals(email, user.email) &&
                Objects.equals(fName, user.fName) &&
                Objects.equals(lName, user.lName) &&
                Objects.equals(password, user.password) &&
                role == user.role;
    }

    @Override
    public String toString() {
        return String.format("id: %s \nusername: %s\nemail: %s\nFirst Name: %s\nLast Name: %s\nPassword: %s\nRole: %s",id,username,email,fName,lName,password,role);
    }

    public static void main(String[] args){

    }
}