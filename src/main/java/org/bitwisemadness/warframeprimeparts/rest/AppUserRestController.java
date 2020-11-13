package org.bitwisemadness.warframeprimeparts.rest;

import com.sun.istack.NotNull;
import org.bitwisemadness.warframeprimeparts.database.model.AppUser;
import org.bitwisemadness.warframeprimeparts.database.model.requirements.companions.RequirementsCollar;
import org.bitwisemadness.warframeprimeparts.services.IAppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/app-user", produces = MediaType.APPLICATION_JSON_VALUE)
public class AppUserRestController {
    @Autowired
    IAppUserService service;

    @GetMapping("/find-all")
    @ResponseStatus(HttpStatus.OK)
    public List<AppUser> findAll() {
        return this.service.findAll();
    }

    @GetMapping("/find-by-name")
    @ResponseStatus(HttpStatus.OK)
    public AppUser findByName(@RequestBody @NotNull String name) {
        return this.service.findByName(name);
    }

    @PutMapping("/put")
    @ResponseStatus(HttpStatus.OK)
    public void put(@RequestBody @NotNull AppUser appUser) {
        this.service.put(appUser);
    }

    @DeleteMapping("/delete")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@RequestBody @NotNull String name) {
        this.service.delete(name);
    }
}
