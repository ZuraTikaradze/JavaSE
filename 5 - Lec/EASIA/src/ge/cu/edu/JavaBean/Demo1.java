package ge.cu.edu.JavaBean;

import java.io.Serializable;

class User implements Serializable {
    private String name;
    private String role;

    public User() {
    }

    public User(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

public class Demo1 {
    public static void main(String[] args) {
        User user = new User();
        user.setName("name1");
        user.setRole("Admin");


        System.out.println(user.getName());
    }
}
