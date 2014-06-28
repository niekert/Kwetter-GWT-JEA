/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.fontys.fhict.jea.gwt.jee7.shared.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author jgeenen
 */
@Entity
@Table(name="ROLETABLE")
public class Role implements Serializable {
    
    public static final String CIVIL_SERVANT="CIVIL_SERVANT", POLICEMAN="POLICEMAN";
    
    private static final long serialVersionUID = 1L;
    
    @Id
    private String roleName;
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Role() {
    }

    public Role(String roleName, String description) {
        this.roleName = roleName;
        this.description = description;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Role other = (Role) obj;
        if ((this.roleName == null) ? (other.roleName != null) : !this.roleName.equals(other.roleName)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + (this.roleName != null ? this.roleName.hashCode() : 0);
        return hash;
    }
    
    
    
}
