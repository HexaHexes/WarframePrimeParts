package org.bitwisemadness.warframeprimeparts.database.model.requirements.companions;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.BaseRequirements;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "RequirementsCollar.findByName", query = "SELECT r FROM RequirementsCollar r WHERE r.name= :name")
public class RequirementsCollar extends BaseRequirements {
    private Integer blueprintRequirement;
    private Integer bindRequirement;
    private Integer buckleRequirement;

    public RequirementsCollar() {
    }

    public RequirementsCollar(String name, Integer blueprintRequirement, Integer bindRequirement, Integer buckleRequirement) {
        super(name);
        this.blueprintRequirement = blueprintRequirement;
        this.bindRequirement = bindRequirement;
        this.buckleRequirement = buckleRequirement;
    }

    public Integer getBlueprintRequirement() {
        return blueprintRequirement;
    }

    public void setBlueprintRequirement(Integer blueprintRequirement) {
        this.blueprintRequirement = blueprintRequirement;
    }

    public Integer getBindRequirement() {
        return bindRequirement;
    }

    public void setBindRequirement(Integer bindRequirement) {
        this.bindRequirement = bindRequirement;
    }

    public Integer getBuckleRequirement() {
        return buckleRequirement;
    }

    public void setBuckleRequirement(Integer buckleRequirement) {
        this.buckleRequirement = buckleRequirement;
    }
}
