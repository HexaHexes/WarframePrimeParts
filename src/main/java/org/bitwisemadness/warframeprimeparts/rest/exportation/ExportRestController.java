package org.bitwisemadness.warframeprimeparts.rest.exportation;

import org.bitwisemadness.warframeprimeparts.services.requirements.exportation.IRequirementsExportService;
import org.bitwisemadness.warframeprimeparts.services.requirements.RequirementsContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/exportation", produces = MediaType.APPLICATION_JSON_VALUE)
public class ExportRestController {
    @Autowired
    private IRequirementsExportService service;

    @GetMapping("/requirements")
    @ResponseStatus(HttpStatus.OK)
    public RequirementsContainer exportRequirements() {
        return this.service.exportRequirements();
    }
}
