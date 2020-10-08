/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bloodbank;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author HP
 */
@Entity
@Table(name = "hospital_info", catalog = "bloodbank", schema = "")
@NamedQueries({
    @NamedQuery(name = "HospitalInfo.findAll", query = "SELECT h FROM HospitalInfo h"),
    @NamedQuery(name = "HospitalInfo.findById", query = "SELECT h FROM HospitalInfo h WHERE h.id = :id"),
    @NamedQuery(name = "HospitalInfo.findByHName", query = "SELECT h FROM HospitalInfo h WHERE h.hName = :hName"),
    @NamedQuery(name = "HospitalInfo.findByEmail", query = "SELECT h FROM HospitalInfo h WHERE h.email = :email"),
    @NamedQuery(name = "HospitalInfo.findByPhone", query = "SELECT h FROM HospitalInfo h WHERE h.phone = :phone"),
    @NamedQuery(name = "HospitalInfo.findByCity", query = "SELECT h FROM HospitalInfo h WHERE h.city = :city")})
public class HospitalInfo implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "h_name")
    private String hName;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "phone")
    private int phone;
    @Basic(optional = false)
    @Column(name = "city")
    private String city;

    public HospitalInfo() {
    }

    public HospitalInfo(Integer id) {
        this.id = id;
    }

    public HospitalInfo(Integer id, String hName, String email, int phone, String city) {
        this.id = id;
        this.hName = hName;
        this.email = email;
        this.phone = phone;
        this.city = city;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getHName() {
        return hName;
    }

    public void setHName(String hName) {
        String oldHName = this.hName;
        this.hName = hName;
        changeSupport.firePropertyChange("HName", oldHName, hName);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        int oldPhone = this.phone;
        this.phone = phone;
        changeSupport.firePropertyChange("phone", oldPhone, phone);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        String oldCity = this.city;
        this.city = city;
        changeSupport.firePropertyChange("city", oldCity, city);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HospitalInfo)) {
            return false;
        }
        HospitalInfo other = (HospitalInfo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bloodbank.HospitalInfo[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
