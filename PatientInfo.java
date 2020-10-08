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
@Table(name = "patient_info", catalog = "bloodbank", schema = "")
@NamedQueries({
    @NamedQuery(name = "PatientInfo.findAll", query = "SELECT p FROM PatientInfo p"),
    @NamedQuery(name = "PatientInfo.findById", query = "SELECT p FROM PatientInfo p WHERE p.id = :id"),
    @NamedQuery(name = "PatientInfo.findByName", query = "SELECT p FROM PatientInfo p WHERE p.name = :name"),
    @NamedQuery(name = "PatientInfo.findByEmail", query = "SELECT p FROM PatientInfo p WHERE p.email = :email"),
    @NamedQuery(name = "PatientInfo.findByPassword", query = "SELECT p FROM PatientInfo p WHERE p.password = :password"),
    @NamedQuery(name = "PatientInfo.findByBloodGroup", query = "SELECT p FROM PatientInfo p WHERE p.bloodGroup = :bloodGroup"),
    @NamedQuery(name = "PatientInfo.findByAddress", query = "SELECT p FROM PatientInfo p WHERE p.address = :address"),
    @NamedQuery(name = "PatientInfo.findByCity", query = "SELECT p FROM PatientInfo p WHERE p.city = :city"),
    @NamedQuery(name = "PatientInfo.findByAge", query = "SELECT p FROM PatientInfo p WHERE p.age = :age"),
    @NamedQuery(name = "PatientInfo.findByGender", query = "SELECT p FROM PatientInfo p WHERE p.gender = :gender")})
public class PatientInfo implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @Column(name = "blood-group")
    private String bloodGroup;
    @Basic(optional = false)
    @Column(name = "address")
    private String address;
    @Basic(optional = false)
    @Column(name = "city")
    private String city;
    @Basic(optional = false)
    @Column(name = "age")
    private int age;
    @Basic(optional = false)
    @Column(name = "gender")
    private String gender;

    public PatientInfo() {
    }

    public PatientInfo(Integer id) {
        this.id = id;
    }

    public PatientInfo(Integer id, String name, String email, String password, String bloodGroup, String address, String city, int age, String gender) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.bloodGroup = bloodGroup;
        this.address = address;
        this.city = city;
        this.age = age;
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        String oldPassword = this.password;
        this.password = password;
        changeSupport.firePropertyChange("password", oldPassword, password);
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        String oldBloodGroup = this.bloodGroup;
        this.bloodGroup = bloodGroup;
        changeSupport.firePropertyChange("bloodGroup", oldBloodGroup, bloodGroup);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        String oldCity = this.city;
        this.city = city;
        changeSupport.firePropertyChange("city", oldCity, city);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        int oldAge = this.age;
        this.age = age;
        changeSupport.firePropertyChange("age", oldAge, age);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        String oldGender = this.gender;
        this.gender = gender;
        changeSupport.firePropertyChange("gender", oldGender, gender);
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
        if (!(object instanceof PatientInfo)) {
            return false;
        }
        PatientInfo other = (PatientInfo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bloodbank.PatientInfo[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
