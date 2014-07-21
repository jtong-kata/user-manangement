package net.codejava.spring.model;


/**
 * Created by twer on 7/16/14.
 */
public class User {
    private long id;

    private String userName;

    private String userEmail;

    private int userAge;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail(){
        return this.userEmail;
    }

    public String getUserName(){
        return this.userName;
    }

    public int getUserAge(){
        return this.userAge;
    }
}

