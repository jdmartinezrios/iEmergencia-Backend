package co.com.iemergencia.jpa.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "institutions")
public class Institution implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "name")
    private String name;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "nit")
    private String nit;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "password")
    private String password;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "address")
    private String address;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "telephone")
    private String telephone;
    
    @JoinColumn(name = "id_institutions_types", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private InstitutionType institutionType;
    
    @OneToMany(mappedBy = "institution")
    private List<GetAdvertisement> getAdvertisementList;
    
    @OneToMany(mappedBy = "institution")
    private List<GetSubscription> getSubscriptionList;
    
    @OneToMany(mappedBy = "institution")
    private List<Notification> notificationList;
    
    @OneToMany(mappedBy = "institution")
    private List<Publication> publicationList;

    public Institution() {
    }

    public Institution(Integer id) {
        this.id = id;
    }

    public Institution(Integer id, String name, String nit, String password, String address, String telephone) {
        this.id = id;
        this.name = name;
        this.nit = nit;
        this.password = password;
        this.address = address;
        this.telephone = telephone;
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

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public InstitutionType getInstitutionType() {
        return institutionType;
    }

    public void setInstitutionType(InstitutionType institutionType) {
        this.institutionType = institutionType;
    }

    @XmlTransient
    public List<GetAdvertisement> getGetAdvertisementList() {
        return getAdvertisementList;
    }

    public void setGetAdvertisementList(List<GetAdvertisement> getAdvertisementList) {
        this.getAdvertisementList = getAdvertisementList;
    }

    @XmlTransient
    public List<GetSubscription> getGetSubscriptionList() {
        return getSubscriptionList;
    }

    public void setGetSubscriptionList(List<GetSubscription> getSubscriptionList) {
        this.getSubscriptionList = getSubscriptionList;
    }

    @XmlTransient
    public List<Notification> getNotificationList() {
        return notificationList;
    }

    public void setNotificationList(List<Notification> notificationList) {
        this.notificationList = notificationList;
    }

    @XmlTransient
    public List<Publication> getPublicationList() {
        return publicationList;
    }

    public void setPublicationList(List<Publication> publicationList) {
        this.publicationList = publicationList;
    }

}
