package org.bitwisemadness.warframeprimeparts.database.model.parts.weapons.secondary;

import org.bitwisemadness.warframeprimeparts.database.model.users.AppUser;
import org.bitwisemadness.warframeprimeparts.database.model.parts.BaseParts;
import org.bitwisemadness.warframeprimeparts.database.model.parts.BasePartsId;
import org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.secondary.RequirementsBallistica;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "PartsBallistica.findByName", query = "SELECT r FROM PartsBallistica r WHERE r.id.name= :name")
@NamedQuery(name = "PartsBallistica.findByNameByUser", query = "SELECT r FROM PartsBallistica r WHERE r.id.name= :name AND r.id.appUser= :appUser")
public class PartsBallistica extends BaseParts {
    @ManyToOne
    private RequirementsBallistica baseRequirement;
    private Integer blueprintAmount;
    private Integer upperLimbAmount;
    private Integer lowerLimbAmount;
    private Integer stringAmount;
    private Integer receiverAmount;

    public PartsBallistica() {
    }

    public PartsBallistica(RequirementsBallistica baseRequirement, AppUser appUser) {
        this(baseRequirement, appUser, false, 0, 0, 0, 0, 0);
    }

    public PartsBallistica(RequirementsBallistica baseRequirement, AppUser appUser, Boolean crafted, Integer blueprintAmount, Integer upperLimbAmount, Integer lowerLimbAmount, Integer stringAmount, Integer receiverAmount) {
        super(new BasePartsId(baseRequirement.getName(), appUser.getName()), crafted);
        this.blueprintAmount = blueprintAmount;
        this.upperLimbAmount = upperLimbAmount;
        this.lowerLimbAmount = lowerLimbAmount;
        this.stringAmount = stringAmount;
        this.receiverAmount = receiverAmount;
    }

    public RequirementsBallistica getBaseRequirement() {
        return baseRequirement;
    }

    public void setBaseRequirement(RequirementsBallistica baseRequirement) {
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

    public Integer getReceiverAmount() {
        return receiverAmount;
    }

    public void setReceiverAmount(Integer receiverAmount) {
        this.receiverAmount = receiverAmount;
    }
}
