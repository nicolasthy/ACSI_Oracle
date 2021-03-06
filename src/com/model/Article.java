/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author nicolasthy
 */
@Entity
@Table(name = "ARTICLE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Article.findAll", query = "SELECT a FROM Article a"),
    @NamedQuery(name = "Article.findByArId", query = "SELECT a FROM Article a WHERE a.arId = :arId"),
    @NamedQuery(name = "Article.findByArRef", query = "SELECT a FROM Article a WHERE a.arRef = :arRef"),
    @NamedQuery(name = "Article.findByArLabel", query = "SELECT a FROM Article a WHERE a.arLabel = :arLabel"),
    @NamedQuery(name = "Article.findByArPrix", query = "SELECT a FROM Article a WHERE a.arPrix = :arPrix"),
    @NamedQuery(name = "Article.findByArImage", query = "SELECT a FROM Article a WHERE a.arImage = :arImage")})
public class Article implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "AR_ID")
    private BigDecimal arId;
    @Column(name = "AR_REF")
    private String arRef;
    @Column(name = "AR_LABEL")
    private String arLabel;
    @Column(name = "AR_PRIX")
    private Double arPrix;
    @Column(name = "AR_IMAGE")
    private String arImage;

    public Article() {
    }

    public Article(BigDecimal arId) {
        this.arId = arId;
    }

    public BigDecimal getArId() {
        return arId;
    }

    public void setArId(BigDecimal arId) {
        this.arId = arId;
    }

    public String getArRef() {
        return arRef;
    }

    public void setArRef(String arRef) {
        this.arRef = arRef;
    }

    public String getArLabel() {
        return arLabel;
    }

    public void setArLabel(String arLabel) {
        this.arLabel = arLabel;
    }

    public String getArPrix() {
        return arPrix+"€";
    }

    public void setArPrix(Double arPrix) {
        this.arPrix = arPrix;
    }

    public String getArImage() {
        return arImage;
    }

    public void setArImage(String arImage) {
        this.arImage = arImage;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (arId != null ? arId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Article)) {
            return false;
        }
        Article other = (Article) object;
        if ((this.arId == null && other.arId != null) || (this.arId != null && !this.arId.equals(other.arId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.Article[ arId=" + arId + " ]";
    }
    
}
