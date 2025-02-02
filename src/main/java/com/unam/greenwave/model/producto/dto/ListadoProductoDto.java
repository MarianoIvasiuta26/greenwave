package com.unam.greenwave.model.producto.dto;

import com.unam.greenwave.model.producto.Categoria;
import com.unam.greenwave.model.producto.ProductoIndividual;

public record ListadoProductoDto (
        Long id,
        String nombre,
        Integer stock,
        Double precio,
        String descripcion,
        Categoria categoria
)
{
    public ListadoProductoDto(ProductoIndividual producto){
        this(producto.getId(), producto.getNombre(), producto.getStock(), producto.getPrecio(), producto.getDescripcion(), producto.getCategoria());
    }

}
