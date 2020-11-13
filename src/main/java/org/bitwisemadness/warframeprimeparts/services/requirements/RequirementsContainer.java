package org.bitwisemadness.warframeprimeparts.services.requirements;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.companions.RequirementsCollar;
import org.bitwisemadness.warframeprimeparts.database.model.requirements.companions.RequirementsSentinel;
import org.bitwisemadness.warframeprimeparts.database.model.requirements.frames.RequirementsArchwing;
import org.bitwisemadness.warframeprimeparts.database.model.requirements.frames.RequirementsWarframe;
import org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.melee.RequirementsMelee;
import org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.melee.RequirementsSilvaAegis;
import org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.melee.RequirementsTipedo;
import org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.primary.RequirementsBow;
import org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.primary.RequirementsCrossbow;
import org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.primary.RequirementsPrimary;
import org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.secondary.*;

import java.util.List;

public class RequirementsContainer {
    // Companions
    List<RequirementsCollar> requirementsCollars;
    List<RequirementsSentinel> requirementsSentinels;

    // Frames
    List<RequirementsArchwing> requirementsArchwings;
    List<RequirementsWarframe> requirementsWarframes;

    // Weapons
    // Melee
    List<RequirementsMelee> requirementsMelees;
    List<RequirementsSilvaAegis> requirementsSilvaAegis;
    List<RequirementsTipedo> requirementsTipedos;

    // Primary
    List<RequirementsBow> requirementsBows;
    List<RequirementsCrossbow> requirementsCrossbows;
    List<RequirementsPrimary> requirementsPrimaries;

    // Secondary
    List<RequirementsBallistica> requirementsBallisticas;
    List<RequirementsDualSecondaryNoSingle> requirementsDualSecondaryNoSingles;
    List<RequirementsDualSecondary> requirementsDualSecondaries;
    List<RequirementsSecondary> requirementsSecondaries;
    List<RequirementsThrowing> requirementsThrowings;

    public RequirementsContainer() {
    }

    public List<RequirementsCollar> getRequirementsCollars() {
        return requirementsCollars;
    }

    public void setRequirementsCollars(List<RequirementsCollar> requirementsCollars) {
        this.requirementsCollars = requirementsCollars;
    }

    public List<RequirementsSentinel> getRequirementsSentinels() {
        return requirementsSentinels;
    }

    public void setRequirementsSentinels(List<RequirementsSentinel> requirementsSentinels) {
        this.requirementsSentinels = requirementsSentinels;
    }

    public List<RequirementsArchwing> getRequirementsArchwings() {
        return requirementsArchwings;
    }

    public void setRequirementsArchwings(List<RequirementsArchwing> requirementsArchwings) {
        this.requirementsArchwings = requirementsArchwings;
    }

    public List<RequirementsWarframe> getRequirementsWarframes() {
        return requirementsWarframes;
    }

    public void setRequirementsWarframes(List<RequirementsWarframe> requirementsWarframes) {
        this.requirementsWarframes = requirementsWarframes;
    }

    public List<RequirementsMelee> getRequirementsMelees() {
        return requirementsMelees;
    }

    public void setRequirementsMelees(List<RequirementsMelee> requirementsMelees) {
        this.requirementsMelees = requirementsMelees;
    }

    public List<RequirementsSilvaAegis> getRequirementsSilvaAegis() {
        return requirementsSilvaAegis;
    }

    public void setRequirementsSilvaAegis(List<RequirementsSilvaAegis> requirementsSilvaAegis) {
        this.requirementsSilvaAegis = requirementsSilvaAegis;
    }

    public List<RequirementsTipedo> getRequirementsTipedos() {
        return requirementsTipedos;
    }

    public void setRequirementsTipedos(List<RequirementsTipedo> requirementsTipedos) {
        this.requirementsTipedos = requirementsTipedos;
    }

    public List<RequirementsBow> getRequirementsBows() {
        return requirementsBows;
    }

    public void setRequirementsBows(List<RequirementsBow> requirementsBows) {
        this.requirementsBows = requirementsBows;
    }

    public List<RequirementsCrossbow> getRequirementsCrossbows() {
        return requirementsCrossbows;
    }

    public void setRequirementsCrossbows(List<RequirementsCrossbow> requirementsCrossbows) {
        this.requirementsCrossbows = requirementsCrossbows;
    }

    public List<RequirementsPrimary> getRequirementsPrimaries() {
        return requirementsPrimaries;
    }

    public void setRequirementsPrimaries(List<RequirementsPrimary> requirementsPrimaries) {
        this.requirementsPrimaries = requirementsPrimaries;
    }

    public List<RequirementsBallistica> getRequirementsBallisticas() {
        return requirementsBallisticas;
    }

    public void setRequirementsBallisticas(List<RequirementsBallistica> requirementsBallisticas) {
        this.requirementsBallisticas = requirementsBallisticas;
    }

    public List<RequirementsDualSecondaryNoSingle> getRequirementsDualSecondaryNoSingles() {
        return requirementsDualSecondaryNoSingles;
    }

    public void setRequirementsDualSecondaryNoSingles(List<RequirementsDualSecondaryNoSingle> requirementsDualSecondaryNoSingles) {
        this.requirementsDualSecondaryNoSingles = requirementsDualSecondaryNoSingles;
    }

    public List<RequirementsDualSecondary> getRequirementsDualSecondaries() {
        return requirementsDualSecondaries;
    }

    public void setRequirementsDualSecondaries(List<RequirementsDualSecondary> requirementsDualSecondaries) {
        this.requirementsDualSecondaries = requirementsDualSecondaries;
    }

    public List<RequirementsSecondary> getRequirementsSecondaries() {
        return requirementsSecondaries;
    }

    public void setRequirementsSecondaries(List<RequirementsSecondary> requirementsSecondaries) {
        this.requirementsSecondaries = requirementsSecondaries;
    }

    public List<RequirementsThrowing> getRequirementsThrowings() {
        return requirementsThrowings;
    }

    public void setRequirementsThrowings(List<RequirementsThrowing> requirementsThrowings) {
        this.requirementsThrowings = requirementsThrowings;
    }
}
