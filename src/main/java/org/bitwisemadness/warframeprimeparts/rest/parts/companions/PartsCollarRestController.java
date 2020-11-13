package org.bitwisemadness.warframeprimeparts.rest.parts.companions;

import com.sun.istack.NotNull;
import org.bitwisemadness.warframeprimeparts.database.model.parts.companions.PartsCollar;
import org.bitwisemadness.warframeprimeparts.rest.parts.AppUserPart;
import org.bitwisemadness.warframeprimeparts.services.parts.companions.IPartsCollarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/parts/collar", produces = MediaType.APPLICATION_JSON_VALUE)
public class PartsCollarRestController {
    @Autowired
    private IPartsCollarService service;

    @GetMapping("/find-all")
    @ResponseStatus(HttpStatus.OK)
    public List<PartsCollar> findAll() {
        return this.service.findAll();
    }

    @GetMapping("/find-by-name")
    @ResponseStatus(HttpStatus.OK)
    public List<PartsCollar> findByName(@RequestBody @NotNull String name) {
        return this.service.findByName(name);
    }

    @GetMapping("/find-by-name-by-user")
    @ResponseStatus(HttpStatus.OK)
    public PartsCollar findByNameByUser(@RequestBody @NotNull AppUserPart appUserPart) {
        return this.service.findByNameByUser(appUserPart.getName(), appUserPart.getAppUser());
    }

    @PutMapping("/put")
    @ResponseStatus(HttpStatus.OK)
    public void put(@RequestBody @NotNull PartsCollar collar) {
        this.service.put(collar);
    }

    @DeleteMapping("/delete")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@RequestBody @NotNull AppUserPart appUserPart) {
        this.service.delete(appUserPart.getName(), appUserPart.getAppUser());
    }
}
