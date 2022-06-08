package br.com.receitasdecodigo.site.repository

import br.com.receitasdecodigo.site.entity.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository : JpaRepository<Product, Long>
