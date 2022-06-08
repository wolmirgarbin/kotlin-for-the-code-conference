package br.com.receitasdecodigo.site.service

import br.com.receitasdecodigo.site.entity.Product
import br.com.receitasdecodigo.site.repository.ProductRepository
import org.springframework.stereotype.Service

@Service
class ProductServiceImpl(
        private val productRepository: ProductRepository
): ProductService {

    override fun get(id: Long) = productRepository.findById(id)

    override fun save(name: String, value: Double) = productRepository.save(
            Product(name = name, value = value)
    )

    override fun findAllNames() = productRepository.findAll().map {
        it.name
    }

    override fun verifyValue(id: Long, verifyValue: Double): String {
        val product = productRepository.getById(id)

        // with is a non-extension function that can access members of its argument concisely: you can omit the instance name when referring to its members.
        with(product) {

            // In Kotlin, if can also be used as an expression.
            return if (value == verifyValue) {
                "Valores Iguais"
            } else {
                "Valor diferente (valor corrente: ${product.getRealFormated()})"
            }
        }
    }
}
