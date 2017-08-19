/*
 * Creation : 18-Aug-2017
 */
package com.techathon.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long entityId;

    @Column(name = "LABEL")
    private String label;

    @Column(name = "PRODUCT_FAMILY")
    private String produtFamily;

    @Column(name = "PRODUCT_GROUP")
    private String productGroup;

    @Column(name = "CREATION_DATE")
    private Date creationDate;

    public Long getEntityId() {
        return entityId;
    }

    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getProdutFamily() {
        return produtFamily;
    }

    public void setProdutFamily(String produtFamily) {
        this.produtFamily = produtFamily;
    }

    public String getProductGroup() {
        return productGroup;
    }

    public void setProductGroup(String productGroup) {
        this.productGroup = productGroup;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

}
