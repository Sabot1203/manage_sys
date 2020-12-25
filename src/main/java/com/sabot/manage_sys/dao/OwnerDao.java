package com.sabot.manage_sys.dao;


import com.sabot.manage_sys.domain.Owner;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OwnerDao {

    List<Owner> findOwners();

    List<Owner> findOwnerByName(String name);

    void insertOwner(Owner owner);

    int deleteOwner(Integer ownerId);

    int updateOwner(Owner owner);
}
