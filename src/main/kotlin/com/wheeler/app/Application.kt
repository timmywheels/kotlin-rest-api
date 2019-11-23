package com.wheeler.app

import com.wheeler.app.model.User
import com.wheeler.app.repository.UserRepository
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@EnableJpaRepositories("com.wheeler.app.*")
@EntityScan("com.wheeler.app.*")
open class Application {

    @Bean
    open fun call(repository: UserRepository) = ApplicationRunner {
        repository.save(User(firstName = "Timothy", lastName = "Wheeler", email = "tim@gmail.com"))
        repository.save(User(firstName = "Andrea", lastName = "Beland", email = "andrea@gmail.com"))
    }

}

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}