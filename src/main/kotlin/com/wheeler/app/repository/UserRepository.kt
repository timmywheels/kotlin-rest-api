package com.wheeler.app.repository

import com.wheeler.app.model.User
import org.springframework.data.repository.CrudRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
interface UserRepository: CrudRepository <User, Long>{}