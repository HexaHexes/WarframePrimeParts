package org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.primary;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.BaseRequirements;

import javax.persistence.Entity;

@Entity
public class RequirementsPrimary extends BaseRequirements {
    private Integer blueprintRequirement;
    private Integer barrelRequirement;
    private Integer receiverRequirement;
    private Integer stockRequirement;

    public RequirementsPrimary() {
    }

    public RequirementsPrimary(String name, Integer blueprintRequirement, Integer barrelRequirement, Integer receiverRequirement, Integer stockRequirement) {
        super(name);
        this.blueprintRequirement = blueprintRequirement;
        this.barrelRequirement = barrelRequirement;
        this.receiverRequirement = receiverRequirement;
        this.stockRequirement = stockRequirement;
    }

    public Integer getBlueprintRequirement() {
        return blueprintRequirement;
    }

    public void setBlueprintRequirement(Integer blueprintRequirement) {
        this.blueprintRequirement = blueprintRequirement;
    }

    public Integer getBarrelRequirement() {
        return barrelRequirement;
    }

    public void setBarrelRequirement(Integer barrelRequirement) {
        this.barrelRequirement = barrelRequirement;
    }

    public Integer getReceiverRequirement() {
        return receiverRequirement;
    }

    public void setReceiverRequirement(Integer receiverRequirement) {
        this.receiverRequirement = receiverRequirement;
    }

    public Integer getStockRequirement() {
        return stockRequirement;
    }

    public void setStockRequirement(Integer stockRequirement) {
        this.stockRequirement = stockRequirement;
    }
}
