package org.bitwisemadness.warframeprimeparts.database.model.parts.companions;

import org.bitwisemadness.warframeprimeparts.database.model.AppUser;
import org.bitwisemadness.warframeprimeparts.database.model.parts.BaseParts;
import org.bitwisemadness.warframeprimeparts.database.model.parts.BasePartsId;
import org.bitwisemadness.warframeprimeparts.database.model.requirements.companions.RequirementsCollar;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import java.util.Arrays;

@Entity
@NamedQuery(name = "PartsCollar.findByName", query = "SELECT r FROM PartsCollar r WHERE r.id.name= :name")
@NamedQuery(name = "PartsCollar.findByNameByUser", query = "SELECT r FROM PartsCollar r WHERE r.id.name= :name AND r.id.appUser= :appUser")
public class PartsCollar extends BaseParts {
    @ManyToOne
    private RequirementsCollar baseRequirement;
    private Integer blueprintAmount;
    private Integer bindAmount;
    private Integer buckleAmount;

    public PartsCollar() {
    }

    public PartsCollar(BasePartsId id, Boolean crafted, RequirementsCollar baseRequirement, Integer blueprintAmount, Integer bindAmount, Integer buckleAmount) {
        super(id, crafted);
        this.baseRequirement = baseRequirement;
        this.blueprintAmount = blueprintAmount;
        this.bindAmount = bindAmount;
        this.buckleAmount = buckleAmount;
    }

    public PartsCollar(RequirementsCollar baseRequirement, AppUser appUser) {
        this(baseRequirement, appUser, false, 0, 0, 0);
    }

    public PartsCollar(RequirementsCollar baseRequirement, AppUser appUser, Boolean crafted, Integer blueprintAmount, Integer bindAmount, Integer buckleAmount) {
        super(new BasePartsId(baseRequirement.getName(), appUser.getName()), crafted);
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
