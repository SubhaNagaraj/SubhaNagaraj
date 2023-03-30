package com.ecom.shop.product;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class ProductEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String productname;
	private String producttype;
	private String colour;
	private String quantity;
	private Long price;
	private Long count;
	
    public ProductEntity() {
        super();
        // TODO Auto-generated constructor stub
    }

    public ProductEntity(Long id, String productname, String producttype, String colour, String quantity, Long price,
            Long count) {
        super();
        this.id = id;
        this.productname = productname;
        this.producttype = producttype;
        this.colour = colour;
        this.quantity = quantity;
        this.price = price;
        this.count = count;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getProducttype() {
        return producttype;
    }

    public void setProducttype(String producttype) {
        this.producttype = producttype;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "ProductEntity [id=" + id + ", productname=" + productname + ", producttype=" + producttype + ", colour="
                + colour + ", quantity=" + quantity + ", price=" + price + ", count=" + count + "]";
    }
	
	
   
}
