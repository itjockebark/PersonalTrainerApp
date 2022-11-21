package itjockebark.personaltrainer.security;

import com.google.common.collect.Sets;

import java.util.Set;

import static itjockebark.personaltrainer.security.UserPermission.*;

public enum UserRole {

    CLIENT(Sets.newHashSet()),
    PERSONAL_TRAINER(Sets.newHashSet(CLIENT_READ, CLIENT_WRITE, SCHEDULES_READ, SCHEDULES_WRITE)),
    ADMIN(Sets.newHashSet());

    private final Set<UserPermission> permissions;


    UserRole(Set<UserPermission> permissions) {
        this.permissions = permissions;
    }
}
