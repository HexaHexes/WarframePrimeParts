package org.bitwisemadness.warframeprimeparts.database.model.parts.weapons.primary;

import org.bitwisemadness.warframeprimeparts.database.model.users.AppUser;
import org.bitwisemadness.warframeprimeparts.database.model.parts.BaseParts;
import org.bitwisemadness.warframeprimeparts.database.model.parts.BasePartsId;
import org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.primary.RequirementsBow;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "PartsBow.findByName", query = "SELECT r FROM PartsBow r WHERE r.id.name= :name")
@NamedQuery(name = "PartsBow.findByNameByUser", query = "SELECT r FROM PartsBow r WHERE r.id.name= :name AND r.id.appUser= :appUser")
public class PartsBow extends BaseParts {
    @ManyToOne
    private RequirementsBow baseRequirement;
    private Integer blueprintAmount;
    private Integer upperLimbAmount;
    private Integer lowerLimbAmount;
    private Integer stringAmount;
    private Integer gripAmount;

    public PartsBow() {
    }

    public PartsBow(RequirementsBow baseRequirement, AppUser appUser) {
        this(baseRequirement, appUser, false, 0, 0, 0, 0, 0);
    }

    public PartsBow(RequirementsBow baseRequirement, AppUser appUser, Boolean crafted, Integer blueprintAmount, Integer upperLimbAmount, Integer lowerLimbAmount, Integer stringAmount, Integer gripAmount) {
        super(new BasePartsId(baseRequirement.getName(), appUser.getName()), crafted);
        this.blueprintAmount = blueprintAmount;
        this.upperLimbAmount = upperLimbAmount;
        this.lowerLimbAmount = lowerLimbAmount;
        this.stringAmount = stringAmount;
        this.gripAmount = gripAmount;
    }

    public RequirementsBow getBaseRequirement() {
        return baseRequirement;
    }

    public void setBaseRequirement(RequirementsBow baseRequirement) {
        this.baseRequirement = baseRequirement;
    }

    public Integer getBlueprintAmount() {
        return blueprintAmount;
    }

    public void setBlueprintAmount(Integer blueprintAmount) {
        this.blueprintAmount = blueprintAmount;
    }

    public Integer getUpperLimbAmount() {
        return upperLimbAmount;
    }

    public void setUpperLimbAmount(Integer upperLimbAmount) {
        this.upperLimbAmount = upperLimbAmount;
    }

    public Integer getLowerLimbAmount() {
        return lowerLimbAmount;
    }

    public void setLowerLimbAmount(Integer lowerLimbAmount) {
        this.lowerLimbAmount = lowerLimbAmount;
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
