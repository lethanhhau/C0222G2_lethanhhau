package furama.com.model;

public class Role {
    private Integer roleId;
    private String roleName;
    private Integer status;

    public Role(){}

    public Role(Integer roleId, String roleName, Integer status) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.status = status;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getStatus(){
        return status;
    }

    public void setStatus(Integer status){
        this.status = status;
    }
}
