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
@Table(name = "donater_info", catalog = "bloodbank", schema = "")
@NamedQueries({
    @NamedQuery(name = "DonaterInfo.findAll", query = "SELECT d FROM DonaterInfo d"),
    @NamedQuery(name = "DonaterInfo.findByDonoId", query = "SELECT d FROM DonaterInfo d WHERE d.donoId = :donoId"),
    @NamedQuery(name = "DonaterInfo.findByName", query = "SELECT d FROM DonaterInfo d WHERE d.name = :name"),
    @NamedQuery(name = "DonaterInfo.findByEmail", query = "SELECT d FROM DonaterInfo d WHERE d.email = :email"),
    @NamedQuery(name = "DonaterInfo.findByPassword", query = "SELECT d FROM DonaterInfo d WHERE d.password = :password"),
    @NamedQuery(name = "DonaterInfo.findByPhone", query = "SELECT d FROM DonaterInfo d WHERE d.phone = :phone"),
    @NamedQuery(name = "DonaterInfo.findByBloogGroup", query = "SELECT d FROM DonaterInfo d WHERE d.bloogGroup = :bloogGroup"),
    @NamedQuery(name = "DonaterInfo.findByAddress", query = "SELECT d FROM DonaterInfo d WHERE d.address = :address"),
    @NamedQuery(name = "DonaterInfo.findByCity", query = "SELECT d FROM DonaterInfo d WHERE d.city = :city"),
    @NamedQuery(name = "DonaterInfo.findByAge", query = "SELECT d FROM DonaterInfo d WHERE d.age = :age"),
    @NamedQuery(name = "DonaterInfo.findByGender", query = "SELECT d FROM DonaterInfo d WHERE d.gender = :gender")})
public class DonaterInfo implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "dono- id")
    private Integer donoId;
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
    @Column(name = "phone")
    private int phone;
    @Basic(optional = false)
    @Column(name = "bloog-group")
    private String bloogGroup;
    @Basic(optional = false)
    @Column(name = "address")
    private int address;
    @Basic(optional = false)
    @Column(name = "city")
    private String city;
    @Basic(optional = false)
    @Column(name = "age")
    private int age;
    @Basic(optional = false)
    @Column(name = "gender")
    private String gender;

    public DonaterInfo() {
    }

    public DonaterInfo(Integer donoId) {
        this.donoId = donoId;
    }

    public DonaterInfo(Integer donoId, String name, String email, String password, int phone, String bloogGroup, int address, String city, int age, String gender) {
        this.donoId = donoId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.bloogGroup = bloogGroup;
        this.address = address;
        this.city = city;
        this.age = age;
        this.gender = gender;
    }

    public Integer getDonoId() {
        return donoId;
    }

    public void setDonoId(Integer donoId) {
        Integer oldDonoId = this.donoId;
        this.donoId = donoId;
        changeSupport.firePropertyChange("donoId", oldDonoId, donoId);
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

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        int oldPhone = this.phone;
        this.phone = phone;
        changeSupport.firePropertyChange("phone", oldPhone, phone);
    }

    public String getBloogGroup() {
        return bloogGroup;
    }

    public void setBloogGroup(String bloogGroup) {
        String oldBloogGroup = this.bloogGroup;
        this.bloogGroup = bloogGroup;
        changeSupport.firePropertyChange("bloogGroup", oldBloogGroup, bloogGroup);
    }

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        int oldAddress = this.address;
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
        hash += (donoId != null ? donoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DonaterInfo)) {
            return false;
        }
        DonaterInfo other = (DonaterInfo) object;
        if ((this.donoId == null && other.donoId != null) || (this.donoId != null && !this.donoId.equals(other.donoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bloodbank.DonaterInfo[ donoId=" + donoId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
