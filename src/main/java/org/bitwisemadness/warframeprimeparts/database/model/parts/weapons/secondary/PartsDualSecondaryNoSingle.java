package org.bitwisemadness.warframeprimeparts.database.model.parts.weapons.secondary;

import org.bitwisemadness.warframeprimeparts.database.model.users.AppUser;
import org.bitwisemadness.warframeprimeparts.database.model.parts.BaseParts;
import org.bitwisemadness.warframeprimeparts.database.model.parts.BasePartsId;
import org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.secondary.RequirementsDualSecondaryNoSingle;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "PartsDualSecondaryNoSingle.findByName", query = "SELECT r FROM PartsDualSecondaryNoSingle r WHERE r.id.name= :name")
@NamedQuery(name = "PartsDualSecondaryNoSingle.findByNameByUser", query = "SELECT r FROM PartsDualSecondaryNoSingle r WHERE r.id.name= :name AND r.id.appUser= :appUser")
public class PartsDualSecondaryNoSingle extends BaseParts {
    @ManyToOne
    private RequirementsDualSecondaryNoSingle baseRequirement;
    private Integer blueprintAmount;
    private Integer linkAmount;
    private Integer barrelAmount;
    private Integer receiverAmount;

    public PartsDualSecondaryNoSingle() {
    }

    public PartsDualSecondaryNoSingle(RequirementsDualSecondaryNoSingle baseRequirement, AppUser appUser) {
        this(baseRequirement, appUser, false, 0, 0, 0, 0);
    }

    public PartsDualSecondaryNoSingle(RequirementsDualSecondaryNoSingle baseRequirement, AppUser appUser, Boolean crafted, Integer blueprintAmount, Integer linkAmount, Integer barrelAmount, Integer receiverAmount) {
        super(new BasePartsId(baseRequirement.getName(), appUser.getName()), crafted);
        this.blueprintAmount = blueprintAmount;
        this.linkAmount = linkAmount;
        this.barrelAmount = barrelAmount;
        this.receiverAmount = receiverAmount;
    }

    public RequirementsDualSecondaryNoSingle getBaseRequirement() {
        return baseRequirement;
    }

    public void setBaseRequirement(RequirementsDualSecondaryNoSingle baseRequirement) {
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

    public Integer getReceiverAmount() {
        return receiverAmount;
    }

    public void setReceiverAmount(Integer receiverAmount) {
        this.receiverAmount = receiverAmount;
    }

    public Integer getBarrelAmount() {
        return barrelAmount;
    }

    public void setBarrelAmount(Integer barrelAmount) {
        this.barrelAmount = barrelAmount;
    }
}
