package br.com.receitasdecodigo.site.controller

import br.com.receitasdecodigo.site.service.ProductService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/product")
class ProductController(
    private var productService: ProductService
) {

    @GetMapping("/{id}")
    fun get(
            @PathVariable(required = true) id: Long
    ) = ResponseEntity.of(productService.get(id))

    @PostMapping
    fun save(
            @RequestParam(name = "name", required = true) name: String,
            @RequestParam(name = "value", required = true) value: Double
    ) = productService.save(name, value)

    @GetMapping("/names")
    fun getAllNames() = productService.findAllNames()

    @PostMapping("/verify-value/{id}/{value}")
    fun varifyValue(
            @PathVariable(required = true) id: Long,
            @PathVariable(required = true) value: Double
    ) = productService.verifyValue(id, value)
}
