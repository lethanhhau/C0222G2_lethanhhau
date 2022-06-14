package furama.com.model;

public class UserRole {
    private Integer roleId;
    private String username;
    private Integer status;

    public UserRole(){}

    public UserRole(Integer roleId, String username,Integer status) {
        this.roleId = roleId;
        this.username = username;
        this.status = status;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public Integer getStatus(){
        return status;
    }

    public void setStatus(Integer status){
        this.status = status;
    }
}
