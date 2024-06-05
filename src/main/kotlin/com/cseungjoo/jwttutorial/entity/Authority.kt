package com.cseungjoo.jwttutorial.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import lombok.AllArgsConstructor
import lombok.Builder
import lombok.NoArgsConstructor

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
class Authority(
    @Id
    @Column(name = "authority_name", length = 50)
    var authorityName : String
) {


}