package com.tienda.service;

import com.tienda.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    
    //Se enuncia un metodo que recupera los registros de la tabla categoria 
    //dentro de un arraylist, pueden ser todos los registros o solo los activos
    
    public List<Categoria> getCategorias(boolean acttivos);
    
}
