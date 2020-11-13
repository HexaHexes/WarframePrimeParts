package org.bitwisemadness.warframeprimeparts.rest.importation;

import com.sun.istack.NotNull;
import org.bitwisemadness.warframeprimeparts.services.requirements.RequirementsContainer;
import org.bitwisemadness.warframeprimeparts.services.requirements.importation.IRequirementsImportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/importation", produces = MediaType.APPLICATION_JSON_VALUE)
public class ImportRestController {
    @Autowired
    private IRequirementsImportService service;

    @PutMapping("/requirements")
    @ResponseStatus(HttpStatus.OK)
    public void exportRequirements(@RequestBody @NotNull RequirementsContainer requirementsContainer) {
        this.service.importRequirements(requirementsContainer);
    }
}
