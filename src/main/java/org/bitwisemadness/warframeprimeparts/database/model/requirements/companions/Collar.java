package org.bitwisemadness.warframeprimeparts.database.model.requirements.companions;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.BaseRequirement;

import javax.persistence.Entity;

@Entity
public class Collar extends BaseRequirement {
    private Integer blueprintRequirement;
    private Integer bindRequirement;
    private Integer buckleRequirement;

    public Collar(String name, Integer blueprintRequirement, Integer bindRequirement, Integer buckleRequirement) {
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
