package org.bitwisemadness.warframeprimeparts.database.model.parts.companions;

import org.bitwisemadness.warframeprimeparts.database.model.parts.BaseAmounts;
import org.bitwisemadness.warframeprimeparts.database.model.parts.BaseAmountsId;
import org.bitwisemadness.warframeprimeparts.database.model.requirements.companions.RequirementsCollar;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Arrays;

@Entity
public class PartsCollar extends BaseAmounts {
    @ManyToOne
    private RequirementsCollar baseRequirement;
    private Integer blueprintAmount;
    private Integer bindAmount;
    private Integer buckleAmount;

    public PartsCollar(BaseAmountsId id, Boolean crafted, RequirementsCollar baseRequirement, Integer blueprintAmount, Integer bindAmount, Integer buckleAmount) {
        super(id, crafted);
        this.baseRequirement = baseRequirement;
        this.blueprintAmount = blueprintAmount;
        this.bindAmount = bindAmount;
        this.buckleAmount = buckleAmount;
    }

    public RequirementsCollar getBaseRequirement() {
        return baseRequirement;
    }

    public void setBaseRequirement(RequirementsCollar baseRequirement) {
        this.baseRequirement = baseRequirement;
    }

    public Integer getBlueprintAmount() {
        return blueprintAmount;
    }

    public void setBlueprintAmount(Integer blueprintAmount) {
        this.blueprintAmount = blueprintAmount;
    }

    public Integer getBindAmount() {
        return bindAmount;
    }

    public void setBindAmount(Integer bindAmount) {
        this.bindAmount = bindAmount;
    }

    public Integer getBuckleAmount() {
        return buckleAmount;
    }

    public void setBuckleAmount(Integer buckleAmount) {
        this.buckleAmount = buckleAmount;
    }

    @Override
    public Boolean hasFullSet() {
        return this.blueprintAmount >= this.baseRequirement.getBlueprintRequirement()
                && this.bindAmount >= this.baseRequirement.getBindRequirement()
                && this.buckleAmount >= this.baseRequirement.getBuckleRequirement();
    }

    @Override
    public Integer getFullSets() {
        int blueprintSet = this.blueprintAmount / this.baseRequirement.getBlueprintRequirement();
        int bindSet = this.bindAmount / this.baseRequirement.getBindRequirement();
        int buckleSet = this.buckleAmount / this.baseRequirement.getBuckleRequirement();

        return Arrays.stream(new Integer[]{blueprintSet, bindSet, buckleSet}).sorted().findFirst().get();
    }

    public Integer getExtraBlueprints() {
        return this.blueprintAmount - this.getFullSets();
    }

    public Integer getExtraBinds() {
        return this.bindAmount - this.getFullSets();
    }

    public Integer getExtraBuckles() {
        return this.buckleAmount - this.getFullSets();
    }
}
