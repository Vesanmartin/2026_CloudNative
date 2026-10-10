package com.pcfactory.ventas.repository;

import com.pcfactory.ventas.entity.VentaProducto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaProductoRepository extends JpaRepository<VentaProducto, Long> {
}