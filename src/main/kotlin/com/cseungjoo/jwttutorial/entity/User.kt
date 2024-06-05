package com.cseungjoo.jwttutorial.entity

import com.fasterxml.jackson.annotation.JsonIgnore
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.JoinTable
import jakarta.persistence.ManyToMany
import jakarta.persistence.Table
import lombok.AllArgsConstructor
import lombok.Builder
import lombok.NoArgsConstructor

@Entity
@Table(name = "users")
@Builder
@AllArgsConstructor
@NoArgsConstructor
class User(
    @Id
    @JsonIgnore
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var userId : Long,

    @Column(length = 50, unique = true)
    var username : String,

    @JsonIgnore
    @Column(length = 100)
    var password : String,

    @Column(length = 50)
    var nickname : String,

    @JsonIgnore
    @Column
    var activated : Boolean,

    @ManyToMany
    @JoinTable(
        name = "user_authority",
        joinColumns = [JoinColumn(name = "user_id", referencedColumnName = "user_id")],
        inverseJoinColumns = [JoinColumn(name = "authority_name", referencedColumnName = "authority_name")]
    )
    var authorities : Set<Authority>
) {
}