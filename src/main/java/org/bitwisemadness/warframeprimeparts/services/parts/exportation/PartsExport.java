package org.bitwisemadness.warframeprimeparts.services.parts.exportation;

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
import org.springframework.beans.factory.annotation.Autowired;

public class PartsExport {
    // Companions
    @Autowired
    private IPartsCollarService partsCollarService;
    @Autowired
    private IPartsSentinelService partsSentinelService;

    // Frames
    @Autowired
    private IPartsArchwingService partsArchwingService;
    @Autowired
    private IPartsWarframeService partsWarframeService;

    // Weapons
    // Melee
    @Autowired
    private IPartsMeleeService partsMeleeService;
    @Autowired
    private IPartsSilvaAegisService partsSilvaAegisService;
    @Autowired
    private IPartsTipedoService partsTipedoService;

    // Primary
    @Autowired
    private IPartsBowService partsBowService;
    @Autowired
    private IPartsCrossbowService partsCrossbowService;
    @Autowired
    private IPartsPrimaryService partsPrimaryService;

    // Secondary
    @Autowired
    private IPartsBallisticaService partsBallisticaService;
    @Autowired
    private IPartsDualSecondaryService partsDualSecondaryService;
    @Autowired
    private IPartsDualSecondaryNoSingleService partsDualSecondaryNoSingleService;
}
