package br.com.receitasdecodigo.site.entity

import br.com.receitasdecodigo.site.utils.realFormat
import com.fasterxml.jackson.annotation.JsonIgnore
import javax.persistence.*

@Entity
@Table(name = "product")
open class Product(

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long? = null,

        @Column(name = "name", length = 60)
        val name: String,

        @JsonIgnore
        val value: Double
) {
        fun getRealFormated() = realFormat(value)
}
