package br.com.zumbolovsky.fateapp.domain.postgres

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserInfoRepository : JpaRepository<UserInfo?, Int?>