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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Juan David Martinez
 */
@Entity
@Table(name = "departaments")
@XmlRootElement
public class Departament implements Serializable {

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
    
    @OneToMany(mappedBy = "departament")
    private List<Citie> citieList;
    
    @JoinColumn(name = "id_countries", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Countrie countrie;

    public Departament() {
    }

    public Departament(Integer id) {
        this.id = id;
    }

    public Departament(Integer id, String name) {
        this.id = id;
        this.name = name;
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

    @XmlTransient
    public List<Citie> getCitieList() {
        return citieList;
    }

    public void setCitieList(List<Citie> citieList) {
        this.citieList = citieList;
    }

    public Countrie getCountrie() {
        return countrie;
    }

    public void setCountrie(Countrie countrie) {
        this.countrie = countrie;
    }
    
}
