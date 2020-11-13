package org.bitwisemadness.warframeprimeparts.services.parts;

import org.bitwisemadness.warframeprimeparts.database.model.parts.companions.PartsCollar;
import org.bitwisemadness.warframeprimeparts.database.model.parts.companions.PartsSentinel;
import org.bitwisemadness.warframeprimeparts.database.model.parts.frames.PartsArchwing;
import org.bitwisemadness.warframeprimeparts.database.model.parts.frames.PartsWarframe;
import org.bitwisemadness.warframeprimeparts.database.model.parts.weapons.melee.PartsMelee;
import org.bitwisemadness.warframeprimeparts.database.model.parts.weapons.melee.PartsSilvaAegis;
import org.bitwisemadness.warframeprimeparts.database.model.parts.weapons.melee.PartsTipedo;
import org.bitwisemadness.warframeprimeparts.database.model.parts.weapons.primary.PartsBow;
import org.bitwisemadness.warframeprimeparts.database.model.parts.weapons.primary.PartsCrossbow;
import org.bitwisemadness.warframeprimeparts.database.model.parts.weapons.primary.PartsPrimary;
import org.bitwisemadness.warframeprimeparts.database.model.parts.weapons.secondary.PartsBallistica;
import org.bitwisemadness.warframeprimeparts.database.model.parts.weapons.secondary.PartsDualSecondary;
import org.bitwisemadness.warframeprimeparts.database.model.parts.weapons.secondary.PartsDualSecondaryNoSingle;
import org.bitwisemadness.warframeprimeparts.database.model.parts.weapons.secondary.PartsSecondary;
import org.bitwisemadness.warframeprimeparts.services.users.IAppUserService;
import org.bitwisemadness.warframeprimeparts.services.parts.companions.IPartsCollarService;
import org.bitwisemadness.warframeprimeparts.services.parts.companions.IPartsSentinelService;
import org.bitwisemadness.warframeprimeparts.services.parts.frames.IPartsArchwingService;
import org.bitwisemadness.warframeprimeparts.services.parts.frames.IPartsWarframeService;
import org.bitwisemadness.warframeprimeparts.services.parts.weapons.melee.IPartsMeleeService;
import org.bitwisemadness.warframeprimeparts.services.parts.weapons.melee.IPartsSilvaAegisService;
import org.bitwisemadness.warframeprimeparts.services.parts.weapons.melee.IPartsTipedoService;
import org.bitwisemadness.warframeprimeparts.services.parts.weapons.primary.IPartsBowService;
import org.bitwisemadness.warframeprimeparts.services.parts.weapons.primary.IPartsCrossbowService;
import org.bitwisemadness.warframeprimeparts.services.parts.weapons.primary.IPartsPrimaryService;
import org.bitwisemadness.warframeprimeparts.services.parts.weapons.secondary.IPartsBallisticaService;
import org.bitwisemadness.warframeprimeparts.services.parts.weapons.secondary.IPartsDualSecondaryNoSingleService;
import org.bitwisemadness.warframeprimeparts.services.parts.weapons.secondary.IPartsDualSecondaryService;
import org.bitwisemadness.warframeprimeparts.services.parts.weapons.secondary.IPartsSecondaryService;
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
import org.bitwisemadness.warframeprimeparts.services.requirements.weapons.secondary.IRequirementsBallisticaService;
import org.bitwisemadness.warframeprimeparts.services.requirements.weapons.secondary.IRequirementsDualSecondaryNoSingleService;
import org.bitwisemadness.warframeprimeparts.services.requirements.weapons.secondary.IRequirementsDualSecondaryService;
import org.bitwisemadness.warframeprimeparts.services.requirements.weapons.secondary.IRequirementsSecondaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class PartsService implements IPartsService {
    @Autowired
    private IAppUserService appUserService;

    // Companions
    @Autowired
    private IRequirementsCollarService requirementsCollarService;
    @Autowired
    private IPartsCollarService partsCollarService;
    @Autowired
    private IRequirementsSentinelService requirementsSentinelService;
    @Autowired
    private IPartsSentinelService partsSentinelService;

    // Frames
    @Autowired
    private IRequirementsArchwingService requirementsArchwingService;
    @Autowired
    private IPartsArchwingService partsArchwingService;
    @Autowired
    private IRequirementsWarframeService requirementsWarframeService;
    @Autowired
    private IPartsWarframeService partsWarframeService;

    // Weapons
    // Melee
    @Autowired
    private IRequirementsMeleeService requirementsMeleeService;
    @Autowired
    private IPartsMeleeService partsMeleeService;
    @Autowired
    private IRequirementsSilaAegisService requirementsSilaAegisService;
    @Autowired
    private IPartsSilvaAegisService partsSilvaAegisService;
    @Autowired
    private IRequirementsTipedoService requirementsTipedoService;
    @Autowired
    private IPartsTipedoService partsTipedoService;

    // Primary
    @Autowired
    private IRequirementsBowService requirementsBowService;
    @Autowired
    private IPartsBowService partsBowService;
    @Autowired
    private IRequirementsCrossbowService requirementsCrossbowService;
    @Autowired
    private IPartsCrossbowService partsCrossbowService;
    @Autowired
    private IRequirementsPrimaryService requirementsPrimaryService;
    @Autowired
    private IPartsPrimaryService partsPrimaryService;

    // Secondary
    @Autowired
    private IRequirementsBallisticaService requirementsBallisticaService;
    @Autowired
    private IPartsBallisticaService partsBallisticaService;
    @Autowired
    private IRequirementsDualSecondaryService requirementsDualSecondaryService;
    @Autowired
    private IPartsDualSecondaryService partsDualSecondaryService;
    @Autowired
    private IRequirementsDualSecondaryNoSingleService requirementsDualSecondaryNoSingleService;
    @Autowired
    private IPartsDualSecondaryNoSingleService partsDualSecondaryNoSingleService;
    @Autowired
    private IRequirementsSecondaryService requirementsSecondaryService;
    @Autowired
    private IPartsSecondaryService partsSecondaryService;

    @Override
    @PostConstruct
    public void initParts() {
        this.appUserService.findAll().forEach(appUser -> {
            // Companions
            this.requirementsCollarService.findAll().forEach(requirements -> {
                PartsCollar parts = this.partsCollarService.findByNameByUser(requirements.getName(), appUser.getName());
                if (parts == null) {
                    PartsCollar newParts = new PartsCollar(requirements, appUser);
                    newParts.setBaseRequirement(requirements);
                    this.partsCollarService.put(newParts);
                }
            });
            this.requirementsSentinelService.findAll().forEach(requirements -> {
                PartsSentinel parts = this.partsSentinelService.findByNameByUser(requirements.getName(), appUser.getName());
                if (parts == null) {
                    PartsSentinel newParts = new PartsSentinel(requirements, appUser);
                    newParts.setBaseRequirement(requirements);
                    this.partsSentinelService.put(newParts);
                }
            });

            // Frames
            this.requirementsArchwingService.findAll().forEach(requirements -> {
                PartsArchwing parts = this.partsArchwingService.findByNameByUser(requirements.getName(), appUser.getName());
                if (parts == null) {
                    PartsArchwing newParts = new PartsArchwing(requirements, appUser);
                    newParts.setBaseRequirement(requirements);
                    this.partsArchwingService.put(newParts);
                }
            });
            this.requirementsWarframeService.findAll().forEach(requirements -> {
                PartsWarframe parts = this.partsWarframeService.findByNameByUser(requirements.getName(), appUser.getName());
                if (parts == null) {
                    PartsWarframe newParts = new PartsWarframe(requirements, appUser);
                    newParts.setBaseRequirement(requirements);
                    this.partsWarframeService.put(newParts);
                }
            });

            // Weapons
            // Melee
            this.requirementsMeleeService.findAll().forEach(requirements -> {
                PartsMelee parts = this.partsMeleeService.findByNameByUser(requirements.getName(), appUser.getName());
                if (parts == null) {
                    PartsMelee newParts = new PartsMelee(requirements, appUser);
                    newParts.setBaseRequirement(requirements);
                    this.partsMeleeService.put(newParts);
                }
            });
            this.requirementsSilaAegisService.findAll().forEach(requirements -> {
                PartsSilvaAegis parts = this.partsSilvaAegisService.findByNameByUser(requirements.getName(), appUser.getName());
                if (parts == null) {
                    PartsSilvaAegis newParts = new PartsSilvaAegis(requirements, appUser);
                    newParts.setBaseRequirement(requirements);
                    this.partsSilvaAegisService.put(newParts);
                }
            });
            this.requirementsTipedoService.findAll().forEach(requirements -> {
                PartsTipedo parts = this.partsTipedoService.findByNameByUser(requirements.getName(), appUser.getName());
                if (parts == null) {
                    PartsTipedo newParts = new PartsTipedo(requirements, appUser);
                    newParts.setBaseRequirement(requirements);
                    this.partsTipedoService.put(newParts);
                }
            });

            // Primary
            this.requirementsBowService.findAll().forEach(requirements -> {
                PartsBow parts = this.partsBowService.findByNameByUser(requirements.getName(), appUser.getName());
                if (parts == null) {
                    PartsBow newParts = new PartsBow(requirements, appUser);
                    newParts.setBaseRequirement(requirements);
                    this.partsBowService.put(newParts);
                }
            });
            this.requirementsCrossbowService.findAll().forEach(requirements -> {
                PartsCrossbow parts = this.partsCrossbowService.findByNameByUser(requirements.getName(), appUser.getName());
                if (parts == null) {
                    PartsCrossbow newParts = new PartsCrossbow(requirements, appUser);
                    newParts.setBaseRequirement(requirements);
                    this.partsCrossbowService.put(newParts);
                }
            });
            this.requirementsPrimaryService.findAll().forEach(requirements -> {
                PartsPrimary parts = this.partsPrimaryService.findByNameByUser(requirements.getName(), appUser.getName());
                if (parts == null) {
                    PartsPrimary newParts = new PartsPrimary(requirements, appUser);
                    newParts.setBaseRequirement(requirements);
                    this.partsPrimaryService.put(newParts);
                }
            });

            // Secondary
            this.requirementsBallisticaService.findAll().forEach(requirements -> {
                PartsBallistica parts = this.partsBallisticaService.findByNameByUser(requirements.getName(), appUser.getName());
                if (parts == null) {
                    PartsBallistica newParts = new PartsBallistica(requirements, appUser);
                    newParts.setBaseRequirement(requirements);
                    this.partsBallisticaService.put(newParts);
                }
            });
            this.requirementsDualSecondaryNoSingleService.findAll().forEach(requirements -> {
                PartsDualSecondaryNoSingle parts = this.partsDualSecondaryNoSingleService.findByNameByUser(requirements.getName(), appUser.getName());
                if (parts == null) {
                    PartsDualSecondaryNoSingle newParts = new PartsDualSecondaryNoSingle(requirements, appUser);
                    newParts.setBaseRequirement(requirements);
                    this.partsDualSecondaryNoSingleService.put(newParts);
                }
            });
            this.requirementsDualSecondaryService.findAll().forEach(requirements -> {
                PartsDualSecondary parts = this.partsDualSecondaryService.findByNameByUser(requirements.getName(), appUser.getName());
                if (parts == null) {
                    PartsDualSecondary newParts = new PartsDualSecondary(requirements, appUser);
                    newParts.setBaseRequirement(requirements);
                    this.partsDualSecondaryService.put(newParts);
                }
            });
            this.requirementsSecondaryService.findAll().forEach(requirements -> {
                PartsSecondary parts = this.partsSecondaryService.findByNameByUser(requirements.getName(), appUser.getName());
                if (parts == null) {
                    PartsSecondary newParts = new PartsSecondary(requirements, appUser);
                    newParts.setBaseRequirement(requirements);
                    this.partsSecondaryService.put(newParts);
                }
            });
        });
    }
}
