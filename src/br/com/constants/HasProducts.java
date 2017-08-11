package br.com.constants;

import br.com.entitys.Product;
import java.util.List;

public interface HasProducts {

    public List<Product> getProducts();

    public void setProducts(List<Product> products);

}
