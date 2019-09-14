package com.slmanju.meetingroom.users.service;

import com.slmanju.meetingroom.users.service.dto.PermissionDto;
import com.slmanju.meetingroom.users.service.dto.RoleDto;

import java.util.List;

public interface RoleService {

    RoleDto save(RoleDto dto);

    RoleDto findById(String id);

    List<RoleDto> findAll();

    RoleDto update(String id, RoleDto dto);

    void deleteById(String id);

    List<PermissionDto> findPermissionsById(String id);

    List<PermissionDto> upsertPermissions(String id, List<String> permissionIds);

}