package org.bitwisemadness.warframeprimeparts.database.model.parts.weapons.primary;

import org.bitwisemadness.warframeprimeparts.database.model.users.AppUser;
import org.bitwisemadness.warframeprimeparts.database.model.parts.BaseParts;
import org.bitwisemadness.warframeprimeparts.database.model.parts.BasePartsId;
import org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.primary.RequirementsCrossbow;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "PartsCrossbow.findByName", query = "SELECT r FROM PartsCrossbow r WHERE r.id.name= :name")
@NamedQuery(name = "PartsCrossbow.findByNameByUser", query = "SELECT r FROM PartsCrossbow r WHERE r.id.name= :name AND r.id.appUser= :appUser")
public class PartsCrossbow extends BaseParts {
    @ManyToOne
    private RequirementsCrossbow baseRequirement;
    private Integer blueprintAmount;
    private Integer barrelAmount;
    private Integer receiverAmount;
    private Integer stringAmount;
    private Integer gripAmount;

    public PartsCrossbow() {
    }

    public PartsCrossbow(RequirementsCrossbow baseRequirement, AppUser appUser) {
        this(baseRequirement, appUser, false, 0, 0, 0, 0, 0);
    }

    public PartsCrossbow(RequirementsCrossbow baseRequirement, AppUser appUser, Boolean crafted, Integer blueprintAmount, Integer barrelAmount, Integer receiverAmount, Integer stringAmount, Integer gripAmount) {
        super(new BasePartsId(baseRequirement.getName(), appUser.getName()), crafted);
        this.blueprintAmount = blueprintAmount;
        this.barrelAmount = barrelAmount;
        this.receiverAmount = receiverAmount;
        this.stringAmount = stringAmount;
        this.gripAmount = gripAmount;
    }

    public RequirementsCrossbow getBaseRequirement() {
        return baseRequirement;
    }

    public void setBaseRequirement(RequirementsCrossbow baseRequirement) {
        this.baseRequirement = baseRequirement;
    }

    public Integer getBlueprintAmount() {
        return blueprintAmount;
    }

    public void setBlueprintAmount(Integer blueprintAmount) {
        this.blueprintAmount = blueprintAmount;
    }

    public Integer getBarrelAmount() {
        return barrelAmount;
    }

    public void setBarrelAmount(Integer barrelAmount) {
        this.barrelAmount = barrelAmount;
    }

    public Integer getReceiverAmount() {
        return receiverAmount;
    }

    public void setReceiverAmount(Integer receiverAmount) {
        this.receiverAmount = receiverAmount;
    }

    public Integer getStringAmount() {
        return stringAmount;
    }

    public void setStringAmount(Integer stringAmount) {
        this.stringAmount = stringAmount;
    }

    public Integer getGripAmount() {
        return gripAmount;
    }

    public void setGripAmount(Integer gripAmount) {
        this.gripAmount = gripAmount;
    }
}
