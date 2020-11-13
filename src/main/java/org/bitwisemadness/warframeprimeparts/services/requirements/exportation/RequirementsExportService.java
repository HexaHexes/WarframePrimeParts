package org.bitwisemadness.warframeprimeparts.services.requirements.exportation;

import org.bitwisemadness.warframeprimeparts.database.repositories.requirements.weapons.secondary.IRequirementsThrowingRepository;
import org.bitwisemadness.warframeprimeparts.services.requirements.RequirementsContainer;
import org.bitwisemadness.warframeprimeparts.services.requirements.companions.IRequirementsCollarService;
import org.bitwisemadness.warframeprimeparts.services.requirements.companions.IRequirementsSentinelService;
import org.bitwisemadness.warframeprimeparts.services.requirements.frames.IRequirementsArchwingService;
import org.bitwisemadness.warframeprimeparts.services.requirements.frames.IRequirementsWarframeService;
import org.bitwisemadness.warframeprimeparts.services.requirements.weapons.melee.IRequirementsMeleeService;
import org.bitwisemadness.warframeprimeparts.services.requirements.weapons.melee.IRequirementsSilaAegisService;
import org.bitwisemadness.warframeprimeparts.services.requirements.weapons.melee.IRequirementsTipedoService;
import org.bitwisemadness.warframeprimeparts.services.requirements.weapons.primary.IRequirementsBowService;
import org.bitwisemadness.warframeprimeparts.services.requirements.weapons.primary.IRequirementsCrossbowService;
import org.bitwisemadness.warframeprimeparts.services.requirements.weapons.primary.IRequirementsPrimaryService;
import org.bitwisemadness.warframeprimeparts.services.requirements.weapons.secondary.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RequirementsExportService implements IRequirementsExportService {
    // Companions
    @Autowired
    private IRequirementsCollarService requirementsCollarService;
    @Autowired
    private IRequirementsSentinelService requirementsSentinelService;

    // Frames
    @Autowired
    private IRequirementsArchwingService requirementsArchwingService;
    @Autowired
    private IRequirementsWarframeService requirementsWarframeService;

    // Weapons
    // Melee
    @Autowired
    private IRequirementsMeleeService requirementsMeleeService;
    @Autowired
    private IRequirementsSilaAegisService requirementsSilaAegisService;
    @Autowired
    private IRequirementsTipedoService requirementsTipedoService;

    // Primary
    @Autowired
    private IRequirementsBowService requirementsBowService;
    @Autowired
    private IRequirementsCrossbowService requirementsCrossbowService;
    @Autowired
    private IRequirementsPrimaryService requirementsPrimaryService;

    // Secondary
    @Autowired
    private IRequirementsBallisticaService requirementsBallisticaService;
    @Autowired
    private IRequirementsDualSecondaryService requirementsDualSecondaryService;
    @Autowired
    private IRequirementsDualSecondaryNoSingleService requirementsDualSecondaryNoSingleService;
    @Autowired
    private IRequirementsSecondaryService requirementsSecondaryService;
    @Autowired
    private IRequirementsThrowingService requirementsThrowingService;

    @Override
    public RequirementsContainer exportRequirements() {
        RequirementsContainer export = new RequirementsContainer();
        // Companions
        export.setRequirementsCollars(this.requirementsCollarService.findAll());
        export.setRequirementsSentinels(this.requirementsSentinelService.findAll());
        // Frames
        export.setRequirementsArchwings(this.requirementsArchwingService.findAll());
        export.setRequirementsWarframes(this.requirementsWarframeService.findAll());
        // Weapons
        // Melee
        export.setRequirementsMelees(this.requirementsMeleeService.findAll());
        export.setRequirementsSilvaAegis(this.requirementsSilaAegisService.findAll());
        export.setRequirementsTipedos(this.requirementsTipedoService.findAll());
        // Primary
        export.setRequirementsBows(this.requirementsBowService.findAll());
        export.setRequirementsCrossbows(this.requirementsCrossbowService.findAll());
        export.setRequirementsPrimaries(this.requirementsPrimaryService.findAll());
        // Secondary
        export.setRequirementsBallisticas(this.requirementsBallisticaService.findAll());
        export.setRequirementsDualSecondaryNoSingles(this.requirementsDualSecondaryNoSingleService.findAll());
        export.setRequirementsDualSecondaries(this.requirementsDualSecondaryService.findAll());
        export.setRequirementsSecondaries(this.requirementsSecondaryService.findAll());
        export.setRequirementsThrowings(this.requirementsThrowingService.findAll());

        return export;
    }
}

