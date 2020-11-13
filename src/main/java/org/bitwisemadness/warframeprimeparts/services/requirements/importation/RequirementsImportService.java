package org.bitwisemadness.warframeprimeparts.services.requirements.importation;

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
public class RequirementsImportService implements IRequirementsImportService {
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
    private IRequirementsDualSecondaryNoSingleService requirementsDualSecondaryNoSingleService;
    @Autowired
    private IRequirementsDualSecondaryService requirementsDualSecondaryService;
    @Autowired
    private IRequirementsSecondaryService requirementsSecondaryService;
    @Autowired
    private IRequirementsThrowingService requirementsThrowingService;

    @Override
    public void importRequirements(RequirementsContainer requirementsContainer) {
        // Companions
        this.requirementsCollarService.putAll(requirementsContainer.getRequirementsCollars());
        this.requirementsSentinelService.putAll(requirementsContainer.getRequirementsSentinels());
        // Frames
        this.requirementsArchwingService.putAll(requirementsContainer.getRequirementsArchwings());
        this.requirementsWarframeService.putAll(requirementsContainer.getRequirementsWarframes());
        // Weapons
        // Melee
        this.requirementsMeleeService.putAll(requirementsContainer.getRequirementsMelees());
        this.requirementsSilaAegisService.putAll(requirementsContainer.getRequirementsSilvaAegis());
        this.requirementsTipedoService.putAll(requirementsContainer.getRequirementsTipedos());
        // Primary
        this.requirementsBowService.putAll(requirementsContainer.getRequirementsBows());
        this.requirementsCrossbowService.putAll(requirementsContainer.getRequirementsCrossbows());
        this.requirementsPrimaryService.putAll(requirementsContainer.getRequirementsPrimaries());
        // Secondary
        this.requirementsBallisticaService.putAll(requirementsContainer.getRequirementsBallisticas());
        this.requirementsDualSecondaryNoSingleService.putAll(requirementsContainer.getRequirementsDualSecondaryNoSingles());
        this.requirementsDualSecondaryService.putAll(requirementsContainer.getRequirementsDualSecondaries());
        this.requirementsSecondaryService.putAll(requirementsContainer.getRequirementsSecondaries());
        this.requirementsThrowingService.putAll(requirementsContainer.getRequirementsThrowings());
    }
}

