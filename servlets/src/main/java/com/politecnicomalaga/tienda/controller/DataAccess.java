package com.politecnicomalaga.tienda.controller;

public interface DataAccess {
    public String listAllProductos();
    public String findProductoXCodigo(String code);
    public String findClienteXDNI(String dni);
    public String listProductosXPedido(String dni, String pedido);
    public String insertProducto(String jsonProducto);
    public String insertCliente(String jsonCliente);
    public String insertPedido(String jsonPedido);
}
