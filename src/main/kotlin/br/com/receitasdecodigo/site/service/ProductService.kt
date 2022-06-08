package br.com.receitasdecodigo.site.service

import br.com.receitasdecodigo.site.entity.Product
import java.util.*

interface ProductService {

    fun get(id: Long): Optional<Product>

    fun save(name: String, value: Double): Product

    fun findAllNames(): List<String>

    fun verifyValue(id: Long, value: Double): String

}
