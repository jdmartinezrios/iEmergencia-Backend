package co.com.iemergencia.jpa.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Juan David Martinez
 */
@Entity
@Table(name = "packages_advertisements")
public class PackageAdvertisement implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "name")
    private String name;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "months_duration")
    private String monthsDuration;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "number_publications")
    private String numberPublications;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "price")
    private long price;
    
    @OneToMany(mappedBy = "packageAdvertisement")
    private List<GetAdvertisement> getAdvertisementList;

    public PackageAdvertisement() {
    }

    public PackageAdvertisement(Integer id) {
        this.id = id;
    }

    public PackageAdvertisement(Integer id, String name, String monthsDuration, String numberPublications, long price) {
        this.id = id;
        this.name = name;
        this.monthsDuration = monthsDuration;
        this.numberPublications = numberPublications;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMonthsDuration() {
        return monthsDuration;
    }

    public void setMonthsDuration(String monthsDuration) {
        this.monthsDuration = monthsDuration;
    }

    public String getNumberPublications() {
        return numberPublications;
    }

    public void setNumberPublications(String numberPublications) {
        this.numberPublications = numberPublications;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @XmlTransient
    public List<GetAdvertisement> getGetAdvertisementList() {
        return getAdvertisementList;
    }

    public void setGetAdvertisementList(List<GetAdvertisement> getAdvertisementList) {
        this.getAdvertisementList = getAdvertisementList;
    }

}
