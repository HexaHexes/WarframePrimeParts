package org.bitwisemadness.warframeprimeparts.rest.requirements.companions;

import com.sun.istack.NotNull;
import org.bitwisemadness.warframeprimeparts.database.model.requirements.companions.RequirementsCollar;
import org.bitwisemadness.warframeprimeparts.services.requirements.companions.IRequirementsCollarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/requirements/collar", produces = MediaType.APPLICATION_JSON_VALUE)
public class RequirementsCollarRestController {
    @Autowired
    private IRequirementsCollarService service;

    @GetMapping("/find-all")
    @ResponseStatus(HttpStatus.OK)
    public List<RequirementsCollar> findAll() {
        return this.service.findAll();
    }

    @GetMapping("/find-by-name")
    @ResponseStatus(HttpStatus.OK)
    public RequirementsCollar findByName(@RequestBody @NotNull String name) {
        return this.service.findByName(name);
    }

    @PutMapping("/put")
    @ResponseStatus(HttpStatus.OK)
    public void put(@RequestBody @NotNull RequirementsCollar collar) {
        this.service.put(collar);
    }

    @DeleteMapping("/delete")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@RequestBody @NotNull String name) {
        this.service.delete(name);
    }
}
