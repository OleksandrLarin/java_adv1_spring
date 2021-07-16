package com.alevel.service;

import com.alevel.respository.GroupRepository;

public class GroupService {

    private final GroupRepository groupRepository;

    public GroupService(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    public void createNewGroup() {
        groupRepository.createGroup();
    }
}
