package org.bitwisemadness.warframeprimeparts.database.model.parts.weapons.secondary;

import org.bitwisemadness.warframeprimeparts.database.model.users.AppUser;
import org.bitwisemadness.warframeprimeparts.database.model.parts.BaseParts;
import org.bitwisemadness.warframeprimeparts.database.model.parts.BasePartsId;
import org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.secondary.RequirementsDualSecondary;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "PartsDualSecondary.findByName", query = "SELECT r FROM PartsDualSecondary r WHERE r.id.name= :name")
@NamedQuery(name = "PartsDualSecondary.findByNameByUser", query = "SELECT r FROM PartsDualSecondary r WHERE r.id.name= :name AND r.id.appUser= :appUser")
public class PartsDualSecondary extends BaseParts {
    @ManyToOne
    private RequirementsDualSecondary baseRequirement;
    private Integer blueprintAmount;
    private Integer linkAmount;
    private Integer secondaryAmount;

    public PartsDualSecondary() {
    }

    public PartsDualSecondary(RequirementsDualSecondary baseRequirement, AppUser appUser) {
        this(baseRequirement, appUser, false, 0, 0, 0);
    }

    public PartsDualSecondary(RequirementsDualSecondary baseRequirement, AppUser appUser, Boolean crafted, Integer blueprintAmount, Integer linkAmount, Integer secondaryAmount) {
        super(new BasePartsId(baseRequirement.getName(), appUser.getName()), crafted);
        this.blueprintAmount = blueprintAmount;
        this.linkAmount = linkAmount;
        this.secondaryAmount = secondaryAmount;
    }

    public RequirementsDualSecondary getBaseRequirement() {
        return baseRequirement;
    }

    public void setBaseRequirement(RequirementsDualSecondary baseRequirement) {
        this.baseRequirement = baseRequirement;
    }

    public Integer getBlueprintAmount() {
        return blueprintAmount;
    }

    public void setBlueprintAmount(Integer blueprintAmount) {
        this.blueprintAmount = blueprintAmount;
    }

    public Integer getLinkAmount() {
        return linkAmount;
    }

    public void setLinkAmount(Integer linkAmount) {
        this.linkAmount = linkAmount;
    }

    public Integer getSecondaryAmount() {
        return secondaryAmount;
    }

    public void setSecondaryAmount(Integer secondaryAmount) {
        this.secondaryAmount = secondaryAmount;
    }
}
