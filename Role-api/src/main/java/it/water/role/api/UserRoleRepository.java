package it.water.role.api;

import it.water.core.api.model.Role;
import it.water.core.api.repository.BaseRepository;
import it.water.role.model.WaterUserRole;

import java.util.Collection;

/**
 * @Generated by Water Generator
 * Interface component for Role Repository.
 * It is used for CRUD operations, and to interact with the persistence layer.
 */
public interface UserRoleRepository extends BaseRepository<WaterUserRole> {
    Collection<Role> findUserRoles(long userId);

    void removeUserRole(long userId, WaterUserRole role);
}
