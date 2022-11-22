package itjockebark.personaltrainer.security;

public enum UserPermission {
    PERMISSION_ALL("permission:all"),
    PERMISSION_ADMIN("permission:admin"),
    CLIENT_READ("client:read"),
    CLIENT_WRITE("client:write"),
    SCHEDULES_READ("schedules:read"),
    SCHEDULES_WRITE("schedules:write");

    private final String permission;

    UserPermission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
