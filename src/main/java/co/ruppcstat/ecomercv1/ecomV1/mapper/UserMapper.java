package co.ruppcstat.ecomercv1.ecomV1.mapper;

import co.ruppcstat.ecomercv1.ecomV1.deman.Role;
import co.ruppcstat.ecomercv1.ecomV1.deman.User;
import co.ruppcstat.ecomercv1.ecomV1.feature.auth.dtoAuth.*;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User registerToUser(RegisterCreate registerCreate);

    User updateRoll(UpdateRoleCreate updateRoleCreate);

    ResponseRllUpdateV2 entityToResponseRll(User user);

    User changPassword(ChangPassword changPassword);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(source = "newPassword",target = "password")
    void changPassword1(@MappingTarget User user, ChangPassword changPassword);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    //@Mapping(source = "roleName",target = "roles.roleName")
    void updateRoll(@MappingTarget User user, UpdateRoleCreate updateRoleCreate);

   // RoleResponse updateRoleStaff(UpdateRoleCreate updateRoleCreate);

}
