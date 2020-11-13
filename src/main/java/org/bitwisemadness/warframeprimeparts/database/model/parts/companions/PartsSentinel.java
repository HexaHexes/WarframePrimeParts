package org.bitwisemadness.warframeprimeparts.database.model.parts.companions;

import org.bitwisemadness.warframeprimeparts.database.model.users.AppUser;
import org.bitwisemadness.warframeprimeparts.database.model.parts.BaseParts;
import org.bitwisemadness.warframeprimeparts.database.model.parts.BasePartsId;
import org.bitwisemadness.warframeprimeparts.database.model.requirements.companions.RequirementsSentinel;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "PartsSentinel.findByName", query = "SELECT r FROM PartsSentinel r WHERE r.id.name= :name")
@NamedQuery(name = "PartsSentinel.findByNameByUser", query = "SELECT r FROM PartsSentinel r WHERE r.id.name= :name AND r.id.appUser= :appUser")
public class PartsSentinel extends BaseParts {
    @ManyToOne
    private RequirementsSentinel baseRequirement;
    private Integer blueprintAmount;
    private Integer carapaceAmount;
    private Integer cerebrumAmount;
    private Integer systemsAmount;

    public PartsSentinel() {
    }

    public PartsSentinel(RequirementsSentinel baseRequirement, AppUser appUser) {
        this(baseRequirement, appUser, false, 0, 0, 0, 0);
    }

    public PartsSentinel(RequirementsSentinel baseRequirement, AppUser appUser, Boolean crafted, Integer blueprintAmount, Integer carapaceAmount, Integer cerebrumAmount, Integer systemsAmount) {
        super(new BasePartsId(baseRequirement.getName(), appUser.getName()), crafted);
        this.blueprintAmount = blueprintAmount;
        this.carapaceAmount = carapaceAmount;
        this.cerebrumAmount = cerebrumAmount;
        this.systemsAmount = systemsAmount;
    }

    public RequirementsSentinel getBaseRequirement() {
        return baseRequirement;
    }

    public void setBaseRequirement(RequirementsSentinel baseRequirement) {
        this.baseRequirement = baseRequirement;
    }

    public Integer getBlueprintAmount() {
        return blueprintAmount;
    }

    public void setBlueprintAmount(Integer blueprintAmount) {
        this.blueprintAmount = blueprintAmount;
    }

    public Integer getCarapaceAmount() {
        return carapaceAmount;
    }

    public void setCarapaceAmount(Integer carapaceAmount) {
        this.carapaceAmount = carapaceAmount;
    }

    public Integer getCerebrumAmount() {
        return cerebrumAmount;
    }

    public void setCerebrumAmount(Integer cerebrumAmount) {
        this.cerebrumAmount = cerebrumAmount;
    }

    public Integer getSystemsAmount() {
        return systemsAmount;
    }

    public void setSystemsAmount(Integer systemsAmount) {
        this.systemsAmount = systemsAmount;
    }
}
