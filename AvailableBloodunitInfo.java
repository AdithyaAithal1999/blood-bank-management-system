/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bloodbank;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author HP
 */
@Entity
@Table(name = "available_bloodunit_info", catalog = "bloodbank", schema = "")
@NamedQueries({
    @NamedQuery(name = "AvailableBloodunitInfo.findAll", query = "SELECT a FROM AvailableBloodunitInfo a"),
    @NamedQuery(name = "AvailableBloodunitInfo.findById", query = "SELECT a FROM AvailableBloodunitInfo a WHERE a.id = :id"),
    @NamedQuery(name = "AvailableBloodunitInfo.findByBloodGroup", query = "SELECT a FROM AvailableBloodunitInfo a WHERE a.bloodGroup = :bloodGroup"),
    @NamedQuery(name = "AvailableBloodunitInfo.findByUnit", query = "SELECT a FROM AvailableBloodunitInfo a WHERE a.unit = :unit"),
    @NamedQuery(name = "AvailableBloodunitInfo.findByAddress", query = "SELECT a FROM AvailableBloodunitInfo a WHERE a.address = :address"),
    @NamedQuery(name = "AvailableBloodunitInfo.findByDonatedDate", query = "SELECT a FROM AvailableBloodunitInfo a WHERE a.donatedDate = :donatedDate"),
    @NamedQuery(name = "AvailableBloodunitInfo.findByExpiryDate", query = "SELECT a FROM AvailableBloodunitInfo a WHERE a.expiryDate = :expiryDate"),
    @NamedQuery(name = "AvailableBloodunitInfo.findByHospital", query = "SELECT a FROM AvailableBloodunitInfo a WHERE a.hospital = :hospital")})
public class AvailableBloodunitInfo implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "blood group")
    private String bloodGroup;
    @Basic(optional = false)
    @Column(name = "unit")
    private int unit;
    @Basic(optional = false)
    @Column(name = "address")
    private String address;
    @Basic(optional = false)
    @Column(name = "donated date")
    @Temporal(TemporalType.DATE)
    private Date donatedDate;
    @Basic(optional = false)
    @Column(name = "expiry date")
    @Temporal(TemporalType.DATE)
    private Date expiryDate;
    @Basic(optional = false)
    @Column(name = "hospital")
    private String hospital;

    public AvailableBloodunitInfo() {
    }

    public AvailableBloodunitInfo(Integer id) {
        this.id = id;
    }

    public AvailableBloodunitInfo(Integer id, String bloodGroup, int unit, String address, Date donatedDate, Date expiryDate, String hospital) {
        this.id = id;
        this.bloodGroup = bloodGroup;
        this.unit = unit;
        this.address = address;
        this.donatedDate = donatedDate;
        this.expiryDate = expiryDate;
        this.hospital = hospital;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        String oldBloodGroup = this.bloodGroup;
        this.bloodGroup = bloodGroup;
        changeSupport.firePropertyChange("bloodGroup", oldBloodGroup, bloodGroup);
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        int oldUnit = this.unit;
        this.unit = unit;
        changeSupport.firePropertyChange("unit", oldUnit, unit);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public Date getDonatedDate() {
        return donatedDate;
    }

    public void setDonatedDate(Date donatedDate) {
        Date oldDonatedDate = this.donatedDate;
        this.donatedDate = donatedDate;
        changeSupport.firePropertyChange("donatedDate", oldDonatedDate, donatedDate);
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        Date oldExpiryDate = this.expiryDate;
        this.expiryDate = expiryDate;
        changeSupport.firePropertyChange("expiryDate", oldExpiryDate, expiryDate);
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        String oldHospital = this.hospital;
        this.hospital = hospital;
        changeSupport.firePropertyChange("hospital", oldHospital, hospital);
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
        if (!(object instanceof AvailableBloodunitInfo)) {
            return false;
        }
        AvailableBloodunitInfo other = (AvailableBloodunitInfo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bloodbank.AvailableBloodunitInfo[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
