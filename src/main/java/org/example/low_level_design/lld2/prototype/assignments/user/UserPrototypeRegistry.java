package org.example.low_level_design.lld2.prototype.assignments.user;

public interface UserPrototypeRegistry {

    void addPrototype(User user);

    User getPrototype(UserType type);

    User clone(UserType type);
}